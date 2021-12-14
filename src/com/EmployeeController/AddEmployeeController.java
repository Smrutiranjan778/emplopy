package com.EmployeeController;


import java.util.Scanner;

import com.EmployeeBean.EmployeeBean;
import com.EmployeeServiceImpl.EmployeeServiceImpl;

public class AddEmployeeController {

	public void addEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id = scan.nextInt();
		System.out.println("Enter the employee name");
		String name = scan.next();
		System.out.println("Enter the employee gender");
		String gender = scan.next();
		System.out.println("Enter the employee salary");
		float salary = scan.nextFloat();
		EmployeeBean emp = new EmployeeBean(id,name,gender,salary);
		EmployeeServiceImpl empser = new EmployeeServiceImpl();
		empser.addEmployee(emp);
		scan.close();
	}

}
