package com.Gotzilla.Firstapp.repository;

import java.util.List;

import com.Gotzilla.Firstapp.entity.Person;

public interface PersonDAO {
    void save(Person person);
    void update(Person person);
    void delete(Integer id);
    Person get(int id);
    List<Person> getAll();
} 
