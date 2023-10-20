package com.example.springproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "안녕하세요22222!";
    }

    @GetMapping("/test")
    public String helloWorldTest() {
        return "Hello, World test!";
    }

    @GetMapping("/test2")
    public String helloWorldTest2() {
        return "dwdwdwdwdwdwd";
    }

    @GetMapping("/test3")
    public String helloWorldTest3() {
        return "#";
    }
}
