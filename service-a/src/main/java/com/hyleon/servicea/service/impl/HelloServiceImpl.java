package com.hyleon.servicea.service.impl;

import com.hyleon.servicea.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Hyleon
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String callBHello(String name) {
        System.out.println("A.HelloServiceImpl.callBHello");
        return restTemplate.getForObject("http://eureka-client-b/hello/name/" + name, String.class);
    }
}
