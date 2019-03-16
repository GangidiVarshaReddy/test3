package com.vehicleInsurance.main;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.vehicleInsurance.bean.VehicleInsuranceApplication.VehicleDetails;
import com.vehicleInsurance.service.IVehicleApplicationService;
import com.vehicleInsurance.service.VehicleApplicationServiceImpl;

public class MainUi {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		VehicleDetails vehicle=new VehicleDetails();
		IVehicleApplicationService vehicleApplicationService=new VehicleApplicationServiceImpl();
		while(true) {
		
		System.out.println("1.vehicle insurance registration\n2.Insurance validity\n3.exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("enter vehicle no");
			vehicle.setVehicleNo(sc.next());
			System.out.println("enter vehicle type");
			vehicle.setVehicleType(sc.next());
			System.out.println("enter insurance peroid");
		    vehicle.setInsurancePeroid(sc.next());
		    System.out.println("enter aadhar number");
		    vehicle.setAadharNo(sc.next());
		    System.out.println("enter mobile number");
		    vehicle.setMobileNo(sc.next());
		    vehicleApplicationService.register(vehicle);
		    break;
		case 2:
			System.out.println("enter the date");
			//vehicle.setDateOfRegisteration(sc.nextLine());
			vehicle.setDateOfRegisteration(sc.next());
			String dateOfRegistration=sc.next();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy "); 
			Date date=null;
			date=(Date) dtf.parse(dateOfRegistration);
		   
		    
		
		case 3:
			System.exit(0);
			break;
		}
		
	}
}
}
