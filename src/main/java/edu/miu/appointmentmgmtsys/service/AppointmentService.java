package edu.miu.appointmentmgmtsys.service;

import edu.miu.appointmentmgmtsys.model.Appointment;

import java.util.List;

public interface AppointmentService {

    List<Appointment> getAllAppointments();
    List<Appointment> getAppointmentsForAPatient(String patientNumber);

    Appointment addNewAppointment(Appointment newAppointment);
}
