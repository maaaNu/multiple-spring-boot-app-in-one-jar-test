package maaanu.multispring.pone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/project1")
    public String helloWorld() {
        return "Hello World!";
    }
}
