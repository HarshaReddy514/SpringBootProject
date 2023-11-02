package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

//Rest API
@RestController
public class HelloWorldController {

    //Returns HelloWorld
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //bean example
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    //path variable example
    @GetMapping("/hello-world/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean("Hello " + name);
    }
}
