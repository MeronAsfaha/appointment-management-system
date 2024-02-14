package edu.miu.appointmentmgmtsys.controller;

import edu.miu.appointmentmgmtsys.model.Athlete;
import edu.miu.appointmentmgmtsys.service.AthleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/etdm/public/api/athletes")
public class AthleteController {

    private final AthleteService athleteService;

    @GetMapping("/list")
    public ResponseEntity<?> getAllAthletes(){
        return new ResponseEntity<>(athleteService.getAllAthletes(), HttpStatus.OK);
    }

    @GetMapping("/elites/list")
    public ResponseEntity<?> getAllEliteAthletes(){
        return new ResponseEntity<>(athleteService.getAllEliteAthletes(),HttpStatus.OK);
    }
}
