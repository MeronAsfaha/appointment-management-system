package edu.miu.appointmentmgmtsys.controller;

import edu.miu.appointmentmgmtsys.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("uds/ams/api/appointment")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @GetMapping("/list")
    public ResponseEntity<?> getAllAppointments(){
        return new ResponseEntity<>(appointmentService.getAllAppointments(), HttpStatus.OK);
    }

    @GetMapping("/get/patient/{pNum}")
    public ResponseEntity<?> getAllAppointmentsForAPatient(@PathVariable String pNum){
        return new ResponseEntity<>(appointmentService.getAppointmentsForAPatient(pNum), HttpStatus.OK);
    }
}
