package ru.skhanov.springrestfileupload.data;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Person
 */
@Data
@AllArgsConstructor
public class Person {

    private String name;
    private String surname;
    private Integer age;
    private boolean gender;    
}