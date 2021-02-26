package edu.cgcc.cs161;

import java.util.List;

public class Scheduler {

	private ClinicService availServices;
	private Survey survey;
	private ServiceNeed serviceNeed;
	private Appointment appointment;
	private Referral referral;
	
	
	public ClinicService getAvail() {
		return availServices;
	}
	public void setAvail(ClinicService a) {
		availServices = a;
	}
	public Survey getSurvey() {
		return survey;
	}
	public void setSurvey(Survey b) {
		survey = b;
	}
	public ServiceNeed getServiceNeed() {
		return serviceNeed;
	}
	public void setServiceNeed(ServiceNeed c) {
		serviceNeed = c;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment d) {
		appointment = d;
	}
	public Referral getReferral() {
		return referral;
	}
	public void setReferral(Referral e) {
		referral = e;
	}
	
	
	public MedicalEngagement requestToBeSeen() {
		//Before algorithm steps:
		MedicalEngagement medicalEngagement;							//creating a variable to be used to return type MedicalEngagement
		
		Client clientActor = new Client();								//creating clientActor object from Client							
															
		ClinicService clinicService = new ClinicService();				//creating clinicService object from ClinicService
		
		List<ClinicService> list = clinicService.getAvailServices();	//creating list to pass to clientActor of type ClinicService

		//During algorithm steps:
		clientActor.availServicesWork(list);
		
		if(clientActor.availServicesWork(list) == true) {				//If the client picks something from the list, runs makeAppointment
			medicalEngagement = makeAppointment();
		}
		
		else {															//If the client doesn't pick something for the list, continues on
			Survey survey = new Survey();
			
			clientActor.fillOutSurvey(survey);
			
			ServiceNeed serviceNeed = new ServiceNeed();
			
			serviceNeed.identifyNeed(survey);
			
			ClinicService clinicSercive = new ClinicService();
			
			clinicSercive.compare(serviceNeed);
			
			if(clinicSercive.compare(serviceNeed) == true) {			//If the clinic provides service, runs makeAppointment	
				medicalEngagement = makeAppointment();
			}
			
			else {
				medicalEngagement = makeReferral();						//If the clinic doesn't provide service, runs makeReferral
			}
			
		}
		return medicalEngagement;										//returns the medicalEngagement variable
	}
	public MedicalEngagement makeAppointment() {
		Appointment appointment = new Appointment();
		return appointment;
	}
	public MedicalEngagement makeReferral() {
		Referral referral = new Referral();
		return referral;
	}
}
