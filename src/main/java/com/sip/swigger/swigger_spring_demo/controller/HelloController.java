package com.sip.swigger.swigger_spring_demo.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Profile("hello")
@RestController
public class HelloController {
    
    @RequestMapping(value = "/api/javainuse", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello ....swagger";
    }
}
