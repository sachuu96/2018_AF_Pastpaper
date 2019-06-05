package com.springwithmongo.app;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springwithmongo.app.model.Courses;
import com.springwithmongo.app.model.Subject;
import com.springwithmongo.app.repository.CourseTotalRepository;
import com.springwithmongo.app.repository.SubjectRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CourseTotalController {
	
	@Autowired
	CourseTotalRepository repository;
	
	@Autowired
	SubjectRepository SubRepository;
	
	@RequestMapping(value = "/total/{id}", method = RequestMethod.GET)
	public Courses calcTotal(@PathVariable("id") String id) {
		float total = 0;
		
		Optional<Courses> opt =  repository.findById(id);
		Courses modifiedCourse = opt.get();
		String [] Subjects = opt.get().getSubjects();	

		for(int i=0;i< Subjects.length;i++) {
			Optional<Subject> SubjectOpt =  SubRepository.findById(Subjects[i]);
			total = total + SubjectOpt.get().getAmount();
		}
		modifiedCourse.setTotal(total);
		
		return modifiedCourse;
	}
}
