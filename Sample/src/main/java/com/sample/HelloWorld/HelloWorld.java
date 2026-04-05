package com.sample.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
    @GetMapping(path = "/hello-worldBean")
    public HellowWorldBean helloWorldBean() {
        return new HellowWorldBean("Hello World!");
    }

    @GetMapping(path = "/hello-worldBean/path/{name}")
    public HellowWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        return new HellowWorldBean("Hello World! "+name);
    }

}
