package com.bridgelabz.greetingcontrollerapp.service;

import com.bridgelabz.greetingcontrollerapp.model.Greeting;
import com.bridgelabz.greetingcontrollerapp.model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);

    Greeting getGreetingById(long id);

    void delete(long id);

//   Greeting delete(Greeting greetingById);
}
