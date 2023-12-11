package io.gitlab.alpertoy.cloudnative;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greetings")
    public String hello() {
        return "Hello from Cloud Native Devops with AWS!";
    }
}
