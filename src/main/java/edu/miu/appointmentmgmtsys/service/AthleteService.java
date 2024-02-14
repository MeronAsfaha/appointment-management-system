package edu.miu.appointmentmgmtsys.service;

import edu.miu.appointmentmgmtsys.model.Athlete;

import java.util.List;

public interface AthleteService {
    Athlete addNewAthlete(Athlete newAthlete);

    List<Athlete> getAllAthletes();
    List<Athlete> getAllEliteAthletes();
}
