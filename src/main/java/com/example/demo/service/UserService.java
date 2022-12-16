package com.example.demo.service;

import com.example.demo.model.User;

//@Component
public class UserService {
    private final NameGenerator nameGenerator;

//    @Autowired // входящие параметны долдны быть представлены спрингом
    public UserService(NameGenerator nameGenerator) {
        this.nameGenerator = nameGenerator;
    }
    public User createUser() {
        return User
                .builder()
                .name(nameGenerator.genereteName())
                .age(nameGenerator.getRandomNumber(10, 70))
                .build();
    }
}
