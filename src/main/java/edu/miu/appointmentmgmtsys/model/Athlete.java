package edu.miu.appointmentmgmtsys.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "athletes")
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long athleteId;
    @Column(nullable = false, unique = true)
    @NotBlank(message = "ssn can't be null or blank")
    private String ssn;

    @NotBlank(message = "full name can't be null or blank")
    private String fullName;

    private String phoneNumber;

    @NotNull(message = "date of birth can't be null")
    private LocalDate dateOfBirth;

    @NotNull(message = "date of registration can't be null")
    private LocalDate dateOfRegistration;

    @NotNull(message = "number of medals won can't be null")
    private Integer totalNumberOfMedalsWon;
    private Double monthlySalary;
    private String emailAddress;
}
