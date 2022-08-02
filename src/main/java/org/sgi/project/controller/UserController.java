package org.sgi.project.controller;

import org.sgi.project.entity.Person;
import org.sgi.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("test")
    public String test(){
        return "Hello";
    }

    @GetMapping("add")
    public String add(@ModelAttribute Person person){
        Person p= userService.addPerson(person);
        System.out.println(p.getUsername() +"  "+p.getPassword());
        return p.getUsername()+"  Person added";
    }
}
