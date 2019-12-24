package com.ryan.controller;

import com.ryan.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Person person;

    @Autowired
    public void setPerson (Person person) {
        this.person = person;
    }

    @RequestMapping("/getUser")
    public String hello(){
        return person.toString();
    }

}
