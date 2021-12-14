package com.EmployeeController;

import java.util.Scanner;

import com.EmployeeBean.EmployeeBean;
import com.EmployeeServiceImpl.EmployeeServiceImpl;

public class UpdateEmployeeController {
	public void updateEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the employee id where you want to change");
		int id = scan.nextInt();
		System.out.println("Enter the updated employee name");
		String name = scan.next();
		System.out.println("Enter the updated employee gender");
		String gender = scan.next();
		System.out.println("Enter the updated employee salary");
		float salary = scan.nextFloat();
		EmployeeBean emp = new EmployeeBean(id,name,gender,salary);
		EmployeeServiceImpl empser = new EmployeeServiceImpl();
		empser.updateEmployee(emp);
		scan.close();
	}
}
