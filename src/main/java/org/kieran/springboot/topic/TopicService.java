package org.kieran.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	// private list of data
	private List <Topic> topics = new ArrayList <>(Arrays.asList(
			new Topic("Spring","SpringFramework", "Spring Framework Description"),
			new Topic("Java","Javaaa", "Java Framework Description"),
			new Topic("Node","Node JS", "Node Description")			
			));
	
	// method to publish list, eg to controller
	public List <Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void add(Topic topic) {
		topics.add(topic);
		
	}
	public void update(Topic topic, String id) {
		for(int i = 0;i <topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}
	public void delete(String id) {
		topics.removeIf(t ->t.getId().equals(id));
		
	}
	
}
