package com.EmployeeController;

import com.EmployeeBean.EmployeeBean;
import com.EmployeeServiceImpl.EmployeeServiceImpl;

public class GetAllEmployeeController {

	public void getAll() {
		EmployeeServiceImpl allemp = new EmployeeServiceImpl();
		EmployeeBean[] employeebeanarray = allemp.getAllEmployee();
		for(int i=0;i<employeebeanarray.length;i++) {
			EmployeeBean empbean = employeebeanarray[i];
			if(empbean!=null) {
			System.out.println(empbean.getEmpId());
			System.out.println(empbean.getName());
			System.out.println(empbean.getGender());
			System.out.println(empbean.getSalary());
		}}
	}

}
