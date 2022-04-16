package com.BridgeLabz.GrettingAppNew.repository;

import com.BridgeLabz.GrettingAppNew.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
