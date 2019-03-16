package com.vehicleInsurance.bean.VehicleInsuranceApplication;

import java.util.Date;

public class VehicleDetails {
	private String vehicleNo;
	private String vehicleType;
	private String insurancePeroid;
	private String aadharNo;
	private String mobileNo;
	private String dateOfRegisteration;
	
	
	

	public VehicleDetails(String vehicleType, String insurancePeroid, String aadharNo, String mobileNoh) {
		this.vehicleType=vehicleType;
		this.insurancePeroid=insurancePeroid;
		this.aadharNo=aadharNo;
		this.mobileNo=mobileNo;
	}

	public VehicleDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getInsurancePeroid() {
		return insurancePeroid;
	}
	public void setInsurancePeroid(String insurancePeroid) {
		this.insurancePeroid = insurancePeroid;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDateOfRegisteration() {
		return dateOfRegisteration;
	}

	public void setDateOfRegisteration(String string) {
		this.dateOfRegisteration = string;
	}
	
}
