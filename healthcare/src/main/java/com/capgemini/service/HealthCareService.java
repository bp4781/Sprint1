package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.dao.HealthCareDAO;
import com.capgemini.dao.IHealthCareDAO;
import com.capgemini.exception.AppointmentException;

public class HealthCareService implements IHealthCareService  {

	public boolean approveAppointment() {
		// TODO Auto-generated method stub
		IHealthCareDAO dao = new HealthCareDAO();
		return dao.approveAppointment();
	}
	public boolean listOfKeys(String key) throws AppointmentException{
		IHealthCareDAO dao = new HealthCareDAO();
		List<String> l=HealthCareDAO.list;
		boolean flag=true;
		System.out.println(l);
		for (String string : l) {
			if(!string.equals(key))
			{
				flag=false;
				throw new AppointmentException();
				
			}	
			break;
		}
		return flag;

	}

}
