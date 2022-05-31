package com.bridgelabz.greetingcontrollerapp.service;

import com.bridgelabz.greetingcontrollerapp.model.Greeting;
import com.bridgelabz.greetingcontrollerapp.model.User;
import com.bridgelabz.greetingcontrollerapp.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements IGreetingService{


    @Autowired
    private IGreetingRepository greetingRepository;
    private  static final  String template = "Hello , %s ";
    private final AtomicLong counter = new AtomicLong();
    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template,(user.toString().isEmpty()) ?"Hello World!":user.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return greetingRepository.findById(id).get();
    }


}

