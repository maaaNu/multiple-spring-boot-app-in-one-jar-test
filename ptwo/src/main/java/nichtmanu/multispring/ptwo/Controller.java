package nichtmanu.multispring.ptwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("controller2")
@PropertySource("classpath:two.properties")
public class Controller {

    @Value("${my.property}")
    private String myProperty;

    @GetMapping("/project2")
    public String bonjourMonde() {
        return "Bonjour Monde";
    }

    @GetMapping("/propTest")
    public String propTest() {
        return myProperty;
    }
}
