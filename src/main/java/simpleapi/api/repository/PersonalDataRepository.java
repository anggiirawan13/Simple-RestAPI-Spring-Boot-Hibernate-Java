package simpleapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simpleapi.api.entity.PersonalData;

public interface PersonalDataRepository extends JpaRepository<PersonalData, Integer> {}
