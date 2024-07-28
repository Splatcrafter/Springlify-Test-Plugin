package de.splatgames.springlify.testplugin.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class AnotherTestService {

    @PostConstruct
    public void postConstruct() {
        System.out.println("AnotherTestService postConstruct");
    }

    public void test() {
        System.out.println("AnotherTestService test");
    }
}
