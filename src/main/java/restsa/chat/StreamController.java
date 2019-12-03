package restsa.chat;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
public class StreamController {

    @GetMapping("/streaming")
    public ResponseEntity<StreamingResponseBody> streaming(){
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON_UTF8).body(outputStream -> {
            outputStream.flush();
        });
    }
}
