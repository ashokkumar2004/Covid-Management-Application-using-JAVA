package edu.kec.covid1;
import java.util.Scanner;
import edu.kec.covid.model.Patient;
import edu.kec.covid.iservice.*;
import edu.kec.covid.service.*;
import java.util.Random;
public class Covid {
	public static void main(String[] args) {
		IHospitalService hospitalService=new HospitalService();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=scanner.nextLine();
		System.out.println("Enter aadharId: ");
		Long aadharId=scanner.nextLong();
		System.out.println("Enter Latitude: ");
		Double latitude=scanner.nextDouble();
		System.out.println("Enter Longitude: ");
		Double longitude=scanner.nextDouble();
		
		Random random=new Random();
		boolean isPositive=random.nextInt(1,10)>5?true:false;
		if(isPositive) {
			System.out.println("The patient is Positive...");
			Integer hospitalId=hospitalService.findNearByHospital(latitude, longitude);
			if(hospitalId>0) {
				System.out.println("found hospital");
			}
			else {
				System.out.println("Hospital not found...");
			}
		}
		else {
			System.out.println("The patient is negative...");
		}
		Patient patient=new Patient(null,name,isPositive==true?"Positive":"Negative",aadharId);
		PatientService patientservice=new PatientService();
		patientservice.insert(patient);
	}
	
}