package com.hyleon.serviceb.service.impl;

import com.hyleon.serviceb.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author Hyleon
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String bHello(String name) {
        System.out.println("B.HelloServiceImpl.bHello");
        return "B: Hello, " + name;
    }
}
