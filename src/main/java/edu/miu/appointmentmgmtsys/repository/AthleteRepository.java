package edu.miu.appointmentmgmtsys.repository;

import edu.miu.appointmentmgmtsys.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AthleteRepository extends JpaRepository<Athlete,Long> {

    List<Athlete> getAllByDateOfRegistrationBeforeAndTotalNumberOfMedalsWonGreaterThanEqual(LocalDate date, Integer num);
}
