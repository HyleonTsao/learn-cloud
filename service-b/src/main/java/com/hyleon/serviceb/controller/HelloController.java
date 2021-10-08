package com.hyleon.serviceb.controller;

import com.hyleon.serviceb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hyleon
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("name/{name}")
    public String sayName(@PathVariable("name") String name) {
        System.out.println("B.HelloController.sayName");
        return helloService.bHello(name);
    }
}