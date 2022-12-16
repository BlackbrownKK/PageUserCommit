package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private int age;


}
