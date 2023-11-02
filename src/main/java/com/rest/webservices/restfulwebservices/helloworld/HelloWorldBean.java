package com.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
    public String getMessage() {
        return message;
    }

    private final String message;

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public HelloWorldBean(String message) {
        this.message = message;
    }
}
