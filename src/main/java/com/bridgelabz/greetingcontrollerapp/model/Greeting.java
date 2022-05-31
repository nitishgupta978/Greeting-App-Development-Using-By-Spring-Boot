package com.bridgelabz.greetingcontrollerapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "GREETING")
@AllArgsConstructor
public class Greeting {
    @Id
    @Column(name = "id",nullable = false)

    private final long id;
    private final String message;

// if i use @AllArgsConstructor so no need to write parameters "constuctor"
//    public Greeting(long id, String message) {
//        this.id = id;
//        this.message = message;
//    }
    public Greeting(){
        id=0;
        message="";
    }
}
