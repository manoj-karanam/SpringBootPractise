package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	// CrudRepository<Topic, String> , Topic-class, String-datatype of the primary key
	// spring JPA team have already implemented the below methods in class called CrudRepository
	//getAllTopic()
	//getTopic(string id)
	//updateTopic(Topic t)
	//deleteTopic(string id)
	
	//we have defined a custom method here
	// for example if we want get a course with name property then we can fine a method findByName
	// but we want to get all courses related to a particular topicId so we define a method called findByTopicId 
	// here in the method name Topic is the class name and Id is the property in that class
	
	public List<Course> findByTopicId(String topicId);
	
}
