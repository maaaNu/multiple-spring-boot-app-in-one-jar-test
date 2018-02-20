package nichtmanu.multispring.ptwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("controller2")
public class Controller {

    @GetMapping("/project2")
    public String bonjourMonde() {
        return "Bonjour Monde";
    }
}
