package com.hyleon.servicea.controller;

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

    @GetMapping("name/{name}")
    public String sayName(@PathVariable("name") String name) {
        String result = "Hello, " + name;
        System.out.println(result);
        return result;
    }

}
