package restsa.chat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StreamControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void streaming() {
        HttpEntity<String> requestEntity = new HttpEntity<>("");
        for (int i = 0; i < 100; i++) {
            ResponseEntity<String> actual = restTemplate.exchange("/_streaming", HttpMethod.GET, requestEntity, String.class);
        }
    }
}
