package edu.miu.appointmentmgmtsys;

import edu.miu.appointmentmgmtsys.model.Appointment;
import edu.miu.appointmentmgmtsys.model.Athlete;
import edu.miu.appointmentmgmtsys.service.AppointmentService;
import edu.miu.appointmentmgmtsys.service.AthleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@RequiredArgsConstructor
public class AppointmentMgmtSysApplication implements ApplicationRunner {
    private final AppointmentService appointmentService;
    private final AthleteService athleteService;

    public static void main(String[] args) {
        SpringApplication.run(AppointmentMgmtSysApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        appointmentService.addNewAppointment(new Appointment(null,"P110","John Walker","Robin Plevin",
                LocalDate.of(2013,9,15), LocalTime.of(18,0), null));
        appointmentService.addNewAppointment(new Appointment(null, "P108","Ian Mackay",
                "Tony Smith", LocalDate.of(2013,9,14),
                LocalTime.of(14,0),"1900, North Court Avenue, Phoenix Az 85014"));
        appointmentService.addNewAppointment(new Appointment(null,"P108","Ian Mackay", "Helen Pearson",
                LocalDate.of(2013,9,12), LocalTime.of(10,00),
                "Suite 400, Gallaria Plaza, Phoenix Az 85020"));


        athleteService.addNewAthlete(new Athlete(null,"123-45-67","Usain Bolt","null",
                LocalDate.of(1996,12,3), LocalDate.of(2014,1,4), 16,
                15005.95, null));
        athleteService.addNewAthlete(new Athlete(null,"123-45-68","Anna Marie Rodriguez","(641) 451 - 0001",
                LocalDate.of(2000,5,21), LocalDate.of(2014,11,9), 3,
                        4562.00, "amrod@Gmail.mx"));
        athleteService.addNewAthlete(new Athlete(null, "123-45-69", "Victor Luiz Garcia",null, LocalDate.of(1998,11,7),
                LocalDate.of(2013,11,7), 2, 17750.05, null));

    }
}
