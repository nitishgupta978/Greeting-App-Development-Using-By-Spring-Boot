package com.bridgelabz.greetingcontrollerapp.controller;

import com.bridgelabz.greetingcontrollerapp.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private  static final  String template = "Hello,%s,%s !";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping(value = {"","/"})
    public Greeting greeting(@RequestParam(value = "firstName", defaultValue = "Word!!") String fname,
                             @RequestParam (value = "lastName", defaultValue = "")String lname){
        return new Greeting(counter.incrementAndGet(),String.format(template,fname,lname));

    }
}
