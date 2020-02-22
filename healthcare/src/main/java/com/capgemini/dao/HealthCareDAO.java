package com.capgemini.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.dto.Appointment;
import com.capgemini.dto.DiagnoisticCenter;
import com.capgemini.dto.Test;

public class HealthCareDAO implements IHealthCareDAO {
public HealthCareDAO (){
addValues();
	
}
static HashMap<String,DiagnoisticCenter> map = new HashMap<String,DiagnoisticCenter>();
Scanner scan = new Scanner(System.in);
public static List<String> list = new ArrayList<String>();

public static void addValues() {
	 list.add("Harsh");
	 list.add("Rishita");
	 list.add("Rohan");
	 list.add("Sumani");
	 list.add("Vani");
	Test test1 =new Test("1234","Blood Test");
	Test test2 =new Test("1234","CT-Scan");
	Test test3 =new Test("1234","MRI");
//DiagnoisticCenter.listOfTests.add(new Test("1235","X-Ray"));
//DiagnoisticCenter.listOfTests.add(new Test("1236","CT-Scan"));
Appointment a1 =new Appointment(95566,LocalDate.now(),false,test1);
Appointment a2 = new Appointment(95567,LocalDate.now(),false,test2);
Appointment a3 =new Appointment(95568,LocalDate.now(),false,test1);
DiagnoisticCenter d1 = new DiagnoisticCenter();
d1.setCenterId("8919");
d1.setCenterName("Hyderabad");

d1.setListOfTests(Arrays.asList(test1,test2,test3));
//d1.listOfTests.add(test2);
//d1.listOfTests.add(test3);
d1.setAppointmentList(Arrays.asList(a1,a2,a3));
		/*
		 * d1.appointmentList.add(a2); d1.appointmentList.add(a3);
		 */
DiagnoisticCenter d2 = new DiagnoisticCenter();
d2.setCenterId("2827");
d2.setCenterName("Secunderabad");
d2.setListOfTests(Arrays.asList(test1,test2,test3));
		/*
		 * d2.listOfTests.add(test2); d2.listOfTests.add(test3);
		 */
d2.setAppointmentList(Arrays.asList(a1,a2,a3));
map.put(d1.getCenterId(),d1);
map.put(d2.getCenterId(),d2);
DiagnoisticCenter center1=new DiagnoisticCenter();
}
	public boolean approveAppointment() {
		// TODO Auto-generated method stub
		Set <String> set=(HealthCareDAO.map).keySet();
		int count=1;
		for(String s:set)
		{
			System.out.println("You have a center "+map.get(s).getCenterName()   +"--"+"Center and id is "+s);
			count++;
		}
		System.out.println("Enter Center id :");
		String str=scan.next();
		DiagnoisticCenter center=HealthCareDAO.map.get(str);                                                                           //get Diagonistic object of given key 
		List<Appointment> l=center.getAppointmentList();
		//System.out.println(l);
		int y=1;
		for(Appointment a:l)
		{
			System.out.println("Enter Approval or disapproval");
		boolean decision=scan.nextBoolean()	;
			a.setApproved(decision);
			if(a.isApproved()==true)
			{	System.out.println("Appointment id number "+a.getAppointmentid()+"---is Approved");}
			else {System.out.println("Appointment id number "+a.getAppointmentid()+"---is not Approved");}
			y++;
			if(y>3)
				break;
			
		}
		center.setAppointmentList(l);
		System.out.println("Appointment List count :"+l.size());
		
		return false;
	}
	}
