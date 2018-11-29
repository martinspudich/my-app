package com.example.myapp.scheduler;

import com.example.myutils.domain.User;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    @Scheduled(fixedRate = 2000)
    public void test() {
        User user = new User();
        user.setFirstname("Olga");
        user.setLastname("Spudichova");
        System.out.println("TEST: " + user);
    }

}
