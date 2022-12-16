package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameGenerator {

    private List<String> names = List.of("Roma", "Alex", "Fill");

    public String genereteName() {
        return names.get(getRandomNumber(0, 3));

    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random()) * (max - min) + min);
    }
}
