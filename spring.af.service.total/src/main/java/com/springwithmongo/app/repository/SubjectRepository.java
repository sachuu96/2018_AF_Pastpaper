package com.springwithmongo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springwithmongo.app.model.Subject;

public interface SubjectRepository extends MongoRepository<Subject, String> {

}
