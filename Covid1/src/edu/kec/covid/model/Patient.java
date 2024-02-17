package edu.kec.covid.model;

public class Patient {
	private Integer id;
	private String name;
	private String status;
	private Long aadharId;
	public Patient(Integer id, String name, String status, Long aadharId) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.aadharId = aadharId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getAadharId() {
		return aadharId;
	}
	public void setAadharId(Long aadharId) {
		this.aadharId = aadharId;
	}
}