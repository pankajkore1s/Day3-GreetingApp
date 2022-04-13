package com.BridgeLabz.GrettingAppNew.controller;

import com.BridgeLabz.GrettingAppNew.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@RestController
@RequestMapping("/greeting")
public class GreetingAppController {
    private static final String template="Hello,%s";
    private final AtomicLong counter=new AtomicLong();

    //extended greetingController to use services layer to get simple greeting

    @GetMapping("")
    public Greeting greeting(@RequestParam(value="name",defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
