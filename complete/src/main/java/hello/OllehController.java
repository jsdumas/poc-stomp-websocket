package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class OllehController {
	
	 @MessageMapping("/olleh")
	    @SendTo("/administration/greeting")
	    public Greeting gniteerg(HelloMessage message) throws Exception {
	        Thread.sleep(1000); // simulated delay
	        return new Greeting("Olleh, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	    }

}
