package com.BridgeLabz.GrettingAppNew.service;

import com.BridgeLabz.GrettingAppNew.entity.Greeting;
import com.BridgeLabz.GrettingAppNew.entity.User;
import com.BridgeLabz.GrettingAppNew.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService{
    private static final String template="Hello, %s";
    private final AtomicLong counter=new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user){
        String message=String.format(template,(user.toString().isEmpty()?"Hello World":user.toString()));
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }
    @Override
    public Greeting getGreeting(long id){
        return greetingRepository.findById(id).get();
    }
}
