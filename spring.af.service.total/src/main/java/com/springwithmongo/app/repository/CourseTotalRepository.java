package com.springwithmongo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springwithmongo.app.model.Courses;

public interface CourseTotalRepository extends MongoRepository<Courses,String> {

}
