package com.example.EsercizioPerson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.EsercizioPerson.model.Person;
import com.example.EsercizioPerson.repository.PersonRepository;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController 
{
    @Autowired
    private PersonRepository repository;

    @GetMapping
    public List<Person> getAllPersons() 
    {
        return repository.findAll();
    }

    @PostMapping("/save")
    public Person addPerson(@RequestBody Person person) 
    {
        return repository.save(person);
    }
}