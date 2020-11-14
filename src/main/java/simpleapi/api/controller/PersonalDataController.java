package simpleapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simpleapi.api.entity.PersonalData;
import simpleapi.api.repository.PersonalDataRepository;
import simpleapi.api.service.PersonalDataService;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/personalData")
public class PersonalDataController {
    @Autowired
    private PersonalDataService personalDataService;

    @Autowired
    PersonalDataRepository personalDataRepository;

    @PostMapping("/add")
    public PersonalData add(@RequestBody PersonalData personalData) {
        return personalDataService.addPersonalData(personalData);
    }

    @GetMapping("/getAll")
    public List<PersonalData> getAll() {
        return personalDataService.getAllPersonalData();
    }

    @GetMapping("/getById/{id}")
    public PersonalData getById(@PathVariable int id) {
        return personalDataService.getPersonalDataById(id);
    }

    @PutMapping("/updateById/{id}")
    public PersonalData updateById(@RequestBody PersonalData personalData, @PathVariable int id) {
        return personalDataService.updatePersonalDataById(personalData, id);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id) {
        return personalDataService.deletePersonalDataById(id);
    }

}
