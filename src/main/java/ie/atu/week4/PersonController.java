package ie.atu.week4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping("/getPerson")
    public String getPerson()
    {
        return "Person returned";
    }
    @PostMapping("/createPerson")
    public String addPerson()
    {
        return "Person added";
    }
}
