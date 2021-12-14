package com.EmployeeController;



import java.util.Scanner;

import com.EmployeeBean.EmployeeBean;
import com.EmployeeServiceImpl.EmployeeServiceImpl;

public class GetEmployeeByIdController {
	public void getById(int id){
		EmployeeServiceImpl empser = new EmployeeServiceImpl();
		EmployeeBean emp = empser.getEmployeeById(id);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary());
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want more details");
		String res = scan.next();
		if(res.equalsIgnoreCase("yes")) {
			System.out.println("Enter the employee id");
			int id1 = scan.nextInt();
			GetEmployeeByIdController get = new GetEmployeeByIdController();
			get.getById(id1);
		}else {
			System.out.println("Thank you...!!!");
		}
		scan.close();
	}

}
