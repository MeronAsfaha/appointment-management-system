package edu.miu.appointmentmgmtsys.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name ="appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "patient number can't be null or blank")
    private String patientNumber;

    @NotBlank(message = "patient name can't be null or blank")
    private String patientName;

    @NotBlank(message = "dentist name can't be null or blank")
    private String dentistName;

    @NotNull(message = "appointment date can't be null")
    private LocalDate  appointmentDate;

    @NotNull(message = "appointment time can't be null")
    private LocalTime appointmentTime;

    private String surgeryLocation;
}
