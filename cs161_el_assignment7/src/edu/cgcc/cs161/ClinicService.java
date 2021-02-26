package edu.cgcc.cs161;

import java.util.ArrayList;
import java.util.List;

public class ClinicService {

	private int serviceNumber;
	private String serviceName;
	private String serviceDescription;
	
	
	public int getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(int a) {
		serviceNumber = a;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String b) {
		serviceName = b;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String c) {
		serviceDescription = c;
	}
	
	
	public List<ClinicService> getAvailServices() {
		
		return new ArrayList<ClinicService>();
	}
	public boolean compare(ServiceNeed SN) {
		
		return true;
	}
}
