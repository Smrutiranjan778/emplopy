package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.employee.bean.EmployeeBean;
import com.employee.service.EmployeeService;
import com.employee.util.EmployeeMessage;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeRestController.
 */
//@RestController
@Controller
public class EmployeeRestController {
	
	/** The employeeservice. */
	//@Autowired
	private EmployeeService employeeservice;
	//test
	
	/** The employeemessage. */
	//@Autowired
	private EmployeeMessage employeemessage;

	/**
	 * Instantiates a new employee rest controller.
	 *
	 * @param employeeservice the employeeservice
	 * @param employeemessage the employeemessage
	 */
	public EmployeeRestController(EmployeeService employeeservice, EmployeeMessage employeemessage) {
		super();
		this.employeeservice = employeeservice;
		this.employeemessage = employeemessage;
	}

	// http://localhost:8080/getallemployee
//	@GetMapping(value = "/getallemployee")
/**
	 * Gets the all employee.
	 *
	 * @return the all employee
	 */
	//	@ResponseBody
	@RequestMapping(value = "/getallemployee", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public List<EmployeeBean> getAllEmployee() {
		List<EmployeeBean> empbeanlist = employeeservice.getAllEmployee();
		return empbeanlist;
	}

	// http://localhost:8080/getemployeebyid/3
/**
	 * Gets the employee by id.
	 *
	 * @param Id the id
	 * @return the employee by id
	 */
	//	@GetMapping(value ="/getemployeebyid/{id}")
	@ResponseBody
	@RequestMapping(value = "/getemployeebyid/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public EmployeeBean getEmployeeById(@PathVariable("id") Integer Id) {
		EmployeeBean empbean = employeeservice.getEmployeeById(Id);
		return empbean;
	}

	// http://localhost:8080/getemployeebyidwithqueryparameter?id=2
/**
	 * Gets the employee by id with query parameter.
	 *
	 * @param Id the id
	 * @return the employee by id with query parameter
	 */
	//	@GetMapping(value ="/getemployeebyidwithqueryparameter")
	@ResponseBody
	@RequestMapping(value = "/getemployeebyidwithqueryparameter", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public EmployeeBean getEmployeeByIdWithQueryParameter(@RequestParam("id") Integer Id) {
		EmployeeBean empbean = employeeservice.getEmployeeById(Id);
		return empbean;
	}

	// http://localhost:8080/deleteemployeebyid/2
/**
	 * Delete employee by id.
	 *
	 * @param Id the id
	 * @return the string
	 */
	//	@GetMapping(value ="/deleteemployeebyid/{id}")
	@ResponseBody
	@RequestMapping(value = "/deleteemployeebyid/{id}", method = RequestMethod.DELETE)
	public String deleteEmployeeById(@PathVariable("id") Integer Id) {
		boolean isDeleted = employeeservice.deleteEmployeeById(Id);
		if (isDeleted) {
			String msg = Id + "is deleted";
			return msg;
		} else {
			String msg = Id + "is not present for delete";
			return msg;
		}
	}

	// http://localhost:8080/deleteemployeebyidwithqueryparameter?id=2

/**
	 * Delete employee by id with query parameter.
	 *
	 * @param Id the id
	 * @return the string
	 */
	//	  @DeleteMapping(value ="/deleteemployeebyidwithqueryparameter")
	@ResponseBody
	@RequestMapping(value = "/deleteemployeebyidwithqueryparameter", method = RequestMethod.DELETE)
	public String deleteEmployeeByIdWithQueryParameter(@RequestParam("id") Integer Id) {
		boolean isDeleted = employeeservice.deleteEmployeeById(Id);
		String msg = employeemessage.getMessage(isDeleted, Id);
//			if(isDeleted) {
//				String msg = Id +"is deleted";
//				return msg;
//			}
//			else {
//				String msg = Id +"is not present for delete";
//				return msg;
//			}
		return msg;
	}

	// @PostMapping(value =
	// "/addemployee",consumes=MediaType.APPLICATION_JSON_VALUE,produces =
	/**
	 * Adds the employee.
	 *
	 * @param empbean the empbean
	 * @return the employee bean
	 */
	// MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@RequestMapping(value = "/addemployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public EmployeeBean addEmployee(@RequestBody EmployeeBean empbean) {
		EmployeeBean emplbean = employeeservice.addEmployee(empbean);
		return emplbean;
	}

	/**
	 * Update employee.
	 *
	 * @param empbean the empbean
	 * @return the employee bean
	 */
	// @PutMapping(value = "/updateemployee")
	@ResponseBody
	@RequestMapping(value = "/updateemployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	public EmployeeBean updateEmployee(@RequestBody EmployeeBean empbean) {
		EmployeeBean emplbean = employeeservice.updateEmployee(empbean);
		return emplbean;
	}
}
