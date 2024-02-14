package edu.miu.appointmentmgmtsys.service.impl;

import edu.miu.appointmentmgmtsys.model.Appointment;
import edu.miu.appointmentmgmtsys.repository.AppointmentRepository;
import edu.miu.appointmentmgmtsys.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll(Sort.by("appointmentDate","appointmentTime"));
    }

    @Override
    public List<Appointment> getAppointmentsForAPatient(String patientNumber) {
        return appointmentRepository.getListOfAppointmentsForAPatientByPatientNumber(patientNumber);
    }

    @Override
    public Appointment addNewAppointment(Appointment newAppointment) {
        return appointmentRepository.save(newAppointment);
    }
}
