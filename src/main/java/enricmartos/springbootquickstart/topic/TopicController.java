package enricmartos.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	//This annotation says that the attribute needs Dependency Injection
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	//Variables en les URL's->curly braces
	@RequestMapping("/topics/{id}")
	//Avisem que id és una variable del Path->Recomanable posar el mateix nom tant el path com a l'argument
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value ="/topics")
	//@Request body indica que la instància de topic prové del cos de la petició 
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value ="/topics/{id}")
	//@Request body indica que la instància de topic prové del cos de la petició 
	public void updateTopic(@RequestBody Topic topic) {
		topicService.updateTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value= "/topics/{id}")
	//Avisem que id és una variable del Path->Recomanable posar el mateix nom tant el path com a l'argument
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

}
