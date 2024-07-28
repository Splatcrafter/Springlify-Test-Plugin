package de.splatgames.springlify.testplugin.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private AnotherTestService anotherTestService;

    @PostConstruct
    public void postConstruct() {
        System.out.println("TestService postConstruct");
        anotherTestService.test();
    }
}
