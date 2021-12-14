package com.employee.service;

import java.util.List;

import com.employee.bean.EmployeeBean;

// TODO: Auto-generated Javadoc
/**
 * The Interface EmployeeService.
 */
public interface EmployeeService {
	
	/**
	 * Adds the employee.
	 *
	 * @param empbean the empbean
	 * @return the employee bean
	 */
	public abstract EmployeeBean addEmployee(EmployeeBean empbean);
	
	/**
	 * Update employee.
	 *
	 * @param empbean the empbean
	 * @return the employee bean
	 */
	public abstract EmployeeBean updateEmployee(EmployeeBean empbean);
	
	/**
	 * Delete employee by id.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	public abstract boolean deleteEmployeeById(int id);
	
	/**
	 * Gets the employee by id.
	 *
	 * @param id the id
	 * @return the employee by id
	 */
	public abstract EmployeeBean getEmployeeById(int id);
	
	/**
	 * Gets the all employee.
	 *
	 * @return the all employee
	 */
	public abstract List<EmployeeBean> getAllEmployee();
}
