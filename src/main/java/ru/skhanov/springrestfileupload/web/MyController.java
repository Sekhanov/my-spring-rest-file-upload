package ru.skhanov.springrestfileupload.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.skhanov.springrestfileupload.data.Person;

/**
 * MyController
 */
@RestController
public class MyController {

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("name", "surname", 20, false);
    }
    
}