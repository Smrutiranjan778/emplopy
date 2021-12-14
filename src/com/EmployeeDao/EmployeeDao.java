package com.EmployeeDao;



import com.EmployeeEntity.EmployeeEntity;

public interface EmployeeDao {
	public abstract void addEmployee(EmployeeEntity employeeentity);
	public abstract void updateEmployee(EmployeeEntity employeeentity);
	public abstract void deleteEmployee(int empId);
	public abstract EmployeeEntity getEmployeeById(int empId);
	public abstract EmployeeEntity[] getAllEmployee();
}
