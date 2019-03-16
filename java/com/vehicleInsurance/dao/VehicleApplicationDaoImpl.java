package com.vehicleInsurance.dao;

import java.util.HashMap;
import java.util.Map;


import com.vehicleInsurance.bean.VehicleInsuranceApplication.VehicleDetails;

public class VehicleApplicationDaoImpl implements IVehicleApplicationDao{
	Map<String,VehicleDetails> vehicleEntry;
	public VehicleApplicationDaoImpl() {
		// TODO Auto-generated constructor stub
		vehicleEntry = new HashMap<String,VehicleDetails>();
		vehicleEntry.put("TS1204",new VehicleDetails("2-wheeler","1 year","123456789","9704075384"));
		vehicleEntry.put("TS1207",new VehicleDetails("2-wheeler","1 year","879065432","9573452413"));
		vehicleEntry.put("TS1199",new VehicleDetails("4-wheeler","2 year","908765430","8106883648"));
	}
	public VehicleDetails register(VehicleDetails register) {
		VehicleDetails vehicle=null;
		
		String vehicleNo=register.getVehicleNo();
		String vehicleType=register.getVehicleType();
		String insurancePeroid=register.getInsurancePeroid();
		String aadharNo=register.getAadharNo();
		String mobileNo=register.getMobileNo();
		for(Map.Entry<String,VehicleDetails> m:vehicleEntry.entrySet() ) {
			if(m.getKey().equals(register)) {
				register=vehicleEntry.put(vehicleNo,new VehicleDetails(vehicleType,insurancePeroid,aadharNo,mobileNo));
			}
		}
		
		
				return register;
		
	}
	public VehicleDetails Validation(VehicleDetails date) {
		
		
		return date;
		
	}
	public VehicleDetails Validation(String insurancePeroid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
