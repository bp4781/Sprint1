package com.capgemini.user;

import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.dao.HealthCareDAO;
import com.capgemini.exception.AppointmentException;
import com.capgemini.service.HealthCareService;
import com.capgemini.service.IHealthCareService;

public class Presentation {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
IHealthCareService service = new HealthCareService();
			while(true)
		{
			System.out.println("Welcome to DiagnoisticCenter");
			System.out.println("1.Customer");
			System.out.println("2.Admin");
			System.out.println("Enter your Choice");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Customer Operations");
				break;		
			}
			case 2:
			{
				//HealthCareDAO h=new HealthCareDAO();
				System.out.println("Welcome Admin");
				System.out.println("Enter your key");
				String key = scan.next();
				HealthCareService serve = new HealthCareService();
				try {
					if(serve.listOfKeys(key))
						
						service.approveAppointment();
						
				} catch (AppointmentException e) {
					// TODO Auto-generated catch block
					System.err.println("Only Admins can Login");
				}
					
			}
			break;	
			default:
				System.out.println("Invalid Entry");
				System.exit(0);
			}
			
			
		}	
		}
}
