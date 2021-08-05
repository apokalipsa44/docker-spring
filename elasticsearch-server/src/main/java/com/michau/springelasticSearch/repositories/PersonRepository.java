package com.michau.springelasticSearch.repositories;

import com.michau.springelasticSearch.models.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {


}
