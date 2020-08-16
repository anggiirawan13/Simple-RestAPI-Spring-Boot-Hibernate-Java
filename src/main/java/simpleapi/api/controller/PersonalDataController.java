package simpleapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simpleapi.api.entity.PersonalData;
import simpleapi.api.service.PersonalDataService;

import java.util.List;

@CrossOrigin
@RestController
public class PersonalDataController {
    @Autowired
    private PersonalDataService personalDataService;

    @PostMapping("/addPersonalData")
    public PersonalData addPersonalData(@RequestBody PersonalData personalData) {
        return personalDataService.addPersonalData(personalData);
    }

    @GetMapping("/getAllPersonalData")
    public List<PersonalData> getAllPersonalData() {
        return personalDataService.getAllPersonalData();
    }

    @GetMapping("/getPersonalDataById/{id}")
    public PersonalData getPersonalDataById(@PathVariable int id) {
        return personalDataService.getPersonalDataById(id);
    }

    @PutMapping("/updatePersonalDataById/{id}")
    public PersonalData updatePersonalDataById(@RequestBody PersonalData personalData, @PathVariable int id) {
        return personalDataService.updatePersonalDataById(personalData, id);
    }

    @DeleteMapping("deletePersonalDataById/{id}")
    public String deletePersonalDataById(@PathVariable int id) {
        return personalDataService.deletePersonalDataById(id);
    }

}
