package com.BridgeLabz.GrettingAppNew.controller;

import com.BridgeLabz.GrettingAppNew.entity.Greeting;
import com.BridgeLabz.GrettingAppNew.entity.User;
import com.BridgeLabz.GrettingAppNew.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;
@RestController
@RequestMapping("/greeting")
public class GreetingAppController {
    //private static final String template="Hello,%s";
    //private final AtomicLong counter=new AtomicLong();

    //extended greetingController to use services layer to get simple greeting
    @Autowired
    GreetingService greetingService;
    @GetMapping("")
    public Greeting greeting(@RequestParam(value="name",defaultValue = "World")String name){
        User user=new User();
        user.setName(name);
        return greetingService.addGreeting(user);
    }
    @RequestMapping("/user")
    public Greeting getGreeting(@RequestParam int id){
        return greetingService.getGreeting(id);
    }

    /*@PutMapping("/{firstName}")
    public Greeting greeting(@PathVariable String firstName,
                             @RequestParam(value = "lastName")String lastName){
        return new Greeting(counter.incrementAndGet(),
                String.format(template,(firstName+" "+lastName)));
    }*/
}
