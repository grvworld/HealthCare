package com.verusys.gourav.service;

import java.util.List;

import com.verusys.gourav.entity.Appointment;

/**
 * @author:GOURAV CHOPRA 
 *  Generated F/w:SHWR-Framework 
 */
public interface IAppointmentService {
	Long saveAppointment(Appointment appointment);
	void updateAppointment(Appointment appointment);
	void deleteAppointment(Long id);
	Appointment getOneAppointment(Long id);
	List<Appointment> getAllAppointments();
	List<Object[]> getAppoinmentsByDoctor(Long docId);
	List<Object[]> getAppoinmentsByDoctorEmail(String userName);
	void updateSlotCountForAppoinment(Long id,int count);
	long getAppointmentCount();
}
