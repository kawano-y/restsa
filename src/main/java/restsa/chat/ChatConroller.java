package restsa.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/restsa/chat")
@RestController
public class ChatConroller {

    @GetMapping({"/", ""})
    public String index() {
        return "hellow";
    }
}
