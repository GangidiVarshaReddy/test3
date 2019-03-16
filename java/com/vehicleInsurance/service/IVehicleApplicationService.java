package com.vehicleInsurance.service;

import com.vehicleInsurance.bean.VehicleInsuranceApplication.VehicleDetails;

public interface IVehicleApplicationService {
	
	VehicleDetails register(VehicleDetails register);
	VehicleDetails Validation(VehicleDetails date);
}
