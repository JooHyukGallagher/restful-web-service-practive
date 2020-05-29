package com.example.restfulwebservice.helloworld;

import lombok.Getter;

@Getter
public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
}
