package org.example.springbootfoofighters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootFooFightersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFooFightersApplication.class, args);
    }

}
