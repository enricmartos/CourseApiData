package enricmartos.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Class that allows to deal with the CRUDrepository
@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),		
			new Topic("javascript", "JavaScript", "JavaScript Description")
			));
	
	public List<Topic> getAllTopics() {
		//Getting a list from the iterable
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add); //Lambda expression
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
		
	}
	
	

}
