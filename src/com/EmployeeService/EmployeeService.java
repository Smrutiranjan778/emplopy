package com.EmployeeService;



import com.EmployeeBean.EmployeeBean;

public interface EmployeeService {
	public abstract void addEmployee(EmployeeBean employeebean);
	public abstract void updateEmployee(EmployeeBean employeebean);
	public abstract void deleteEmployee(int empId);
	public abstract EmployeeBean getEmployeeById(int empId);
	public abstract EmployeeBean[] getAllEmployee();
}
