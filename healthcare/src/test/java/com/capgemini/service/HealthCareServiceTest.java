package com.capgemini.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.capgemini.exception.AppointmentException;

class HealthCareServiceTest {

	HealthCareService service=new HealthCareService();
	
	@Test
	void testListOfKeys() throws AppointmentException {

		//List<String> list = new ArrayList<String>();
		String key="king";
		boolean flag=false;
		/*
		 * list.add("Harsh"); list.add("Rishita"); list.add("Rohan");
		 * list.add("Sumani"); list.add("Vani");
		 */
		 //boolean flag=false;
		/*for (String string : list) {
			if(string.equals(key))
			{
				return true;
			
			}*/
		flag= service.listOfKeys(key);
			assertEquals(true, flag);
			
		}

		
	}


