package restsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("restsa")
@SpringBootApplication
public class RestsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestsaApplication.class, args);
    }
}
