package com.EmployeeEntity;

public class EmployeeEntity {
	private int empId;
	private String name;
	private String gender;
	private float salary;
	public EmployeeEntity() {
		super();
	}
	public EmployeeEntity(int empId, String name, String gender, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
