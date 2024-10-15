package ie.atu.week4;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    List<Person> personList = new ArrayList<>();

    @GetMapping("/getPerson")
    public List<Person> getPerson()
    {
        return personList;
    }
    @PostMapping("/createPerson")
    public List<Person> addPerson(@RequestBody Person person)
    {
        personList.add(person);
        return personList;
    }
}
