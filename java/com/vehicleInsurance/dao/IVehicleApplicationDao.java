package com.vehicleInsurance.dao;

import com.vehicleInsurance.bean.VehicleInsuranceApplication.VehicleDetails;

public interface IVehicleApplicationDao {
	VehicleDetails register(VehicleDetails register);
	VehicleDetails Validation(String date);
	
}
