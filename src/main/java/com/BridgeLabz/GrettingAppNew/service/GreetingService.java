package com.BridgeLabz.GrettingAppNew.service;

import com.BridgeLabz.GrettingAppNew.entity.Greeting;
import com.BridgeLabz.GrettingAppNew.entity.User;

public interface GreetingService {
    Greeting addGreeting(User user);
    Greeting getGreeting(long id);
}
