package com.bridgelabz.greetingcontrollerapp.controller;

import com.bridgelabz.greetingcontrollerapp.model.Greeting;
import com.bridgelabz.greetingcontrollerapp.model.User;
import com.bridgelabz.greetingcontrollerapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

//    private  static final  String template = "Hello,%s,%s !";
//    private final AtomicLong counter = new AtomicLong();
//    both private transfer/use in service so comment

    @Autowired
    private IGreetingService greetingService;
    @GetMapping(value = {"","/"})
    public Greeting greeting(@RequestParam(value = "fName", defaultValue = "Word!!") String fname,
                             @RequestParam (value = "lName", defaultValue = "")String lname){
//        return new Greeting(counter.incrementAndGet(),String.format(template,fname,lname));
        User user = new User();
        user.setFirstName(fname);
        user.setLastName(lname);
        return greetingService.addGreeting(user);


    }
}
