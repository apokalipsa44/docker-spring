package com.michau.springelasticSearch.services;

import com.michau.springelasticSearch.models.Person;
import com.michau.springelasticSearch.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void savePerson(final Person person) {
        personRepository.save(person);
    }

    public Person findPersonByName(final String id){
        return personRepository.findById(id).orElse(null);
    }

    
}
