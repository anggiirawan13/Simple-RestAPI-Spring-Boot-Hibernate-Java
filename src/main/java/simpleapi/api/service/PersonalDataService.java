package simpleapi.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simpleapi.api.entity.PersonalData;
import simpleapi.api.repository.PersonalDataRepository;

import java.util.List;

@Service
public class PersonalDataService {
    @Autowired
    private PersonalDataRepository personalDataRepository;

    public PersonalData addPersonalData(PersonalData personalData) {
        return personalDataRepository.save(personalData);
    }

    public List<PersonalData> getAllPersonalData()  {
        return personalDataRepository.findAll();
    }

    public PersonalData getPersonalDataById(int id) {
        return personalDataRepository.findById(id).orElse(null);
    }

    public PersonalData updatePersonalDataById(PersonalData personalData, int id) {
        PersonalData updatePersonalData = personalDataRepository.findById(id).orElse(null);
        assert updatePersonalData != null;
        updatePersonalData.setName(personalData.getName());
        return personalDataRepository.save(updatePersonalData);
    }

    public String deletePersonalDataById(int id) {
        personalDataRepository.deleteById(id);
        return "Personal Data Removed!";
    }
}
