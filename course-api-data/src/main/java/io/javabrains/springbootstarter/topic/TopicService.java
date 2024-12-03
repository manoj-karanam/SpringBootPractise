package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	@Autowired
	private TopicRepository topicrepository;
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList<>();
		topicrepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicrepository.findById(id).orElse(null);
		
	}
	
	public void addTopic(Topic topic) {
		topicrepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		
		topicrepository.save(topic); // if this topic exists already it will just update
	}

	public void deleteTopic(String id) {
		topicrepository.deleteById(id);
		
	}

}
