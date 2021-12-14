package com.EmployeeServiceImpl;

import com.EmployeeBean.EmployeeBean;
import com.EmployeeDaoImpl.EmployeeDaoImpl;
import com.EmployeeEntity.EmployeeEntity;
import com.EmployeeService.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void addEmployee(EmployeeBean employeebean) {
		EmployeeDaoImpl empdao = new EmployeeDaoImpl();
		EmployeeEntity emp = new EmployeeEntity(employeebean.getEmpId(),employeebean.getName(),employeebean.getGender(),employeebean.getSalary());
		empdao.addEmployee(emp);
	}

	@Override
	public void updateEmployee(EmployeeBean employeebean) {
		EmployeeDaoImpl empdao = new EmployeeDaoImpl();
		EmployeeEntity emp = new EmployeeEntity(employeebean.getEmpId(),employeebean.getName(),employeebean.getGender(),employeebean.getSalary());
		empdao.updateEmployee(emp);
	}

	@Override
	public void deleteEmployee(int empId) {
		EmployeeDaoImpl empdao = new EmployeeDaoImpl();
		empdao.deleteEmployee(empId);
		
	}

	@Override
	public EmployeeBean getEmployeeById(int empId) {
		EmployeeDaoImpl empdao = new EmployeeDaoImpl();
		EmployeeEntity empent = empdao.getEmployeeById(empId);
		EmployeeBean empbean = new EmployeeBean(empent.getEmpId(),empent.getName(),empent.getGender(),empent.getSalary());
		return empbean;
	}

	@Override
	public EmployeeBean[] getAllEmployee() {
		EmployeeDaoImpl empdao = new EmployeeDaoImpl();
		EmployeeEntity[] empentarray = empdao.getAllEmployee();
		EmployeeBean[] empbeanarray = new EmployeeBean[empentarray.length];
		for(int i = 0;i<empbeanarray.length;i++) {
			EmployeeEntity empent = empentarray[i];
			if(empent!=null) {
			EmployeeBean empbean = new EmployeeBean(empent.getEmpId(),empent.getName(),empent.getGender(),empent.getSalary());
			empbeanarray[i]=empbean;
		}}
		return empbeanarray;
	}
}
