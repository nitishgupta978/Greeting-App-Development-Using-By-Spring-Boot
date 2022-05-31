package com.bridgelabz.greetingcontrollerapp.repository;

import com.bridgelabz.greetingcontrollerapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingRepository extends JpaRepository <Greeting,Long>{
}
