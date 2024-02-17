package edu.kec.covid.iservice;

public interface IHospitalService {
	
	public Integer findNearByHospital(Double latitude, Double longitude);
}