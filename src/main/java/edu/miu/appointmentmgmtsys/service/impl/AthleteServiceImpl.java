package edu.miu.appointmentmgmtsys.service.impl;

import edu.miu.appointmentmgmtsys.model.Athlete;
import edu.miu.appointmentmgmtsys.repository.AthleteRepository;
import edu.miu.appointmentmgmtsys.service.AthleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@RequiredArgsConstructor
public class AthleteServiceImpl implements AthleteService {
    private final AthleteRepository athleteRepository;
    @Override
    public Athlete addNewAthlete(Athlete newAthlete) {
        return athleteRepository.save(newAthlete);
    }

    @Override
    public List<Athlete> getAllAthletes() {
        return athleteRepository.findAll(Sort.by("fullName"));
    }

    @Override
    public List<Athlete> getAllEliteAthletes() {
        return athleteRepository
                .getAllByDateOfRegistrationBeforeAndTotalNumberOfMedalsWonGreaterThanEqual(LocalDate.now().minusYears(5),
                        3);
    }
}
