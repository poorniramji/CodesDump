package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<CourceModel, String>{
	
	//Only custom select or other stuff needs to be implements
	//All other common methods (Get, delete, update, create course) can all be done 

}
