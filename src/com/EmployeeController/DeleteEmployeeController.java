package com.EmployeeController;

import java.util.Scanner;

import com.EmployeeServiceImpl.EmployeeServiceImpl;

public class DeleteEmployeeController {

	public void deleteEmployee() {
		System.out.println("Enter the employee id");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		EmployeeServiceImpl empser = new EmployeeServiceImpl();
		empser.deleteEmployee(id);
		scan.close();
	}

}
