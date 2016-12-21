package com.example.hello;

/**
 * Created by preclik on 21.12.2016.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/ss")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
