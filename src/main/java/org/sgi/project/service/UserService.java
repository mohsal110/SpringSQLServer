package org.sgi.project.service;

import org.sgi.project.entity.Person;
import org.sgi.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Person addPerson(Person person){
        userRepository.save(person);
        return person;
    }
}
