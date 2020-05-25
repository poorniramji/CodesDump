package com.example.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	
	/*private List<CourceModel> courseList =  new ArrayList<>(Arrays.asList(new CourceModel("Java", 101,"Introduction to Java"),
			new CourceModel("Python", 102,"Introduction to Python"),
			new CourceModel("DataStage", 103,"Introduction to DataStage")));*/
		
	

	public List<CourceModel> getAllCourceList() {
		Iterable<CourceModel> a =  courseRepository.findAll();
		Iterator<CourceModel> Courseiterator = a.iterator();
		List<CourceModel> templist = new ArrayList<>();
		while(Courseiterator.hasNext()){	
			templist.add(Courseiterator.next());
		}
		
		return templist;
	}

	public Optional<CourceModel> getCourseName(String id) {
		Optional<CourceModel> cm = courseRepository.findById(id);
		return cm;
		
		
	
	}
	
	
	public void addCourse(CourceModel course) {
	//	courseList.add(course);
		
	}

	public void updateCourse(CourceModel course, String courseName) {
	/*	for(int i=0;i<courseList.size();i++) {
			if(courseList.get(i).getCourseName().equals(courseName)) {
				courseList.set(i, course);
				return;
			}
			
		}*/
		
	}

	public void deleteCourse(String courseName) {
		/*for(int i=0;i<courseList.size();i++) {
			if(courseList.get(i).getCourseName().equals(courseName)) {
				courseList.remove(i);
				return;
			}
			
		}*/
		
		
		//Using Java 8 stream functionality
	//	courseList.removeIf(t -> t.getCourseName().equals(courseName));
		
		
		
	}
	
	

}

