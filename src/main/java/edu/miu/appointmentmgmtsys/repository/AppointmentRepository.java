package edu.miu.appointmentmgmtsys.repository;

import edu.miu.appointmentmgmtsys.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    @Query("select a from Appointment a where a.patientNumber = :number")
//    @Query(value = "select * from appointments where `patient_number` = : number", nativeQuery = true)
    List<Appointment> getListOfAppointmentsForAPatientByPatientNumber(@Param("number") String number);
}
