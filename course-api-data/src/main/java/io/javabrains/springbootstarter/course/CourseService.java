package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	
	@Autowired
	private CourseRepository Courserepository;
	
	public List<Course> getAllCourses(String topicId){
		
		List<Course> courses = new ArrayList<>();
		Courserepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		return Courserepository.findById(id).orElse(null);
	
	}
	
	public void addCourse(Course course) {
		Courserepository.save(course);
	}

	public void updateCourse(Course course) {
		
		Courserepository.save(course); // if this topic exists already it will just update
	}

	public void deleteCourse(String id) {
		Courserepository.deleteById(id);
		
	}

}
