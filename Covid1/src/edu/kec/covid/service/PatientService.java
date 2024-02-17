package edu.kec.covid.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import edu.kec.covid.iservice.IPatientService;
import edu.kec.covid.model.Patient;
public class PatientService implements IPatientService{
	public void insert(Patient patient) {
		String sql = "Insert Into covid.patient(name,status,aadharId) Values('"+patient.getName()+"','"+patient.getStatus()+"',"+patient.getAadharId()+")";
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid", "root", "");
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println("Data Inserted Successfully....");
			connection.close();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	
}