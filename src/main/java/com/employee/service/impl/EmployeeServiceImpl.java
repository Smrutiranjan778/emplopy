package com.employee.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.bean.EmployeeBean;
import com.employee.entity.EmployeeEntity;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeServiceImpl.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	/** The employeerepository. */
	@Autowired
	private EmployeeRepository employeerepository;

//	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
//		super();
//		this.employeerepository = employeerepository;
//	}

	/**
 * Adds the employee.
 *
 * @param empbean the empbean
 * @return the employee bean
 */
@Override
	public EmployeeBean addEmployee(EmployeeBean empbean) {
		EmployeeEntity empent = new EmployeeEntity(empbean.getName(), empbean.getGender(), empbean.getSalary());
		empent= employeerepository.save(empent);
		EmployeeBean emplbean = new EmployeeBean(empent.getId(), empent.getName(), empent.getGender(), empent.getSalary());
		return emplbean;
	}

	/**
	 * Update employee.
	 *
	 * @param empbean the empbean
	 * @return the employee bean
	 */
	@Override
	public EmployeeBean updateEmployee(EmployeeBean empbean) {
		EmployeeBean emplbean=null;
		EmployeeEntity empent = employeerepository.findById(empbean.getId()).orElse(null);
		if(empent!=null) {
			empent.setName(empbean.getName());
			empent.setGender(empbean.getGender());
			empent.setSalary(empbean.getSalary());
			empent = employeerepository.save(empent);
			emplbean = new EmployeeBean(empent.getId(),empent.getName(),empent.getGender(),empent.getSalary());
		}
		return emplbean;
	}

	/**
	 * Delete employee by id.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	@Override
	public boolean deleteEmployeeById(int id) {
		boolean isPresent  =	employeerepository.existsById(id);
		if(isPresent){
			employeerepository.deleteById(id);
		}
		 
		return isPresent;
		}
	

	/**
	 * Gets the employee by id.
	 *
	 * @param id the id
	 * @return the employee by id
	 */
	@Override
	public EmployeeBean getEmployeeById(int id) {
		//Optional<EmployeeEntity> empentity = employeerepository.findById(id);
		EmployeeEntity ent = employeerepository.findById(id).orElse(null);
		EmployeeBean empbean=null;
		if(ent!=null) {
			empbean = new EmployeeBean(ent.getId(), ent.getName(), ent.getGender(), ent.getSalary());
		}
		return empbean;
	}

	/**
	 * Gets the all employee.
	 *
	 * @return the all employee
	 */
	@Override
	public List<EmployeeBean> getAllEmployee() {
		// TODO Auto-generated method stub
		List<EmployeeBean> empbeanlist = new ArrayList<EmployeeBean>();
		List<EmployeeEntity> empentity = employeerepository.findAll();
		for (EmployeeEntity employeeEntity : empentity) {
			EmployeeBean empbean = new EmployeeBean(employeeEntity.getId(), employeeEntity.getName(),
					employeeEntity.getGender(), employeeEntity.getSalary());
			empbeanlist.add(empbean);
		}
		return empbeanlist;
	}

}
