package com.vehicleInsurance.service;

import com.vehicleInsurance.bean.VehicleInsuranceApplication.VehicleDetails;
import com.vehicleInsurance.dao.IVehicleApplicationDao;
import com.vehicleInsurance.dao.VehicleApplicationDaoImpl;

public class VehicleApplicationServiceImpl implements IVehicleApplicationService {
	
	public VehicleDetails register(VehicleDetails register) {
		IVehicleApplicationDao vehicleApplicationDao= new VehicleApplicationDaoImpl();
		VehicleDetails vehicleDetails=vehicleApplicationDao.register(register);
		return register;
	}
	
	public VehicleDetails Validation(VehicleDetails date) {
		return date;
		
	}
	

}
