package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	// CrudRepository<Topic, String> , Topic-class, String-datatype of the primary key
	// spring JPA team have already implemented the below methods in class called CrudRepository
	//getAllTopic()
	//getTopic(string id)
	//updateTopic(Topic t)
	//deleteTopic(string id)
	
}
