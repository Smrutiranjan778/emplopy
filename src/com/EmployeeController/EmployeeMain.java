package com.EmployeeController;


import java.util.Scanner;



public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What You Want To Do...?? Please Select From Below The Options ---");
		System.out.println("AddEmployee");
		System.out.println("UpdateEmployee");
		System.out.println("GetEmployeeById");
		System.out.println("GetAllEmployee");
		System.out.println("DeleteEmployee");
		String Req = scan.next();
		if(Req.equalsIgnoreCase("AddEmployee")) {
			AddEmployeeController add = new AddEmployeeController();
			add.addEmployee();
//			System.out.println("Do you want to add more");
//			String res = scan.next();
//			if(res.equalsIgnoreCase("yes")){
//				add.addEmployee();
//			}
//			else {
//				System.out.println("The given employee details have been saved");
//			}
		}
		else if(Req.equalsIgnoreCase("UpdateEmployee")) {
			UpdateEmployeeController update = new UpdateEmployeeController();
			update.updateEmployee();
		}
		else if(Req.equalsIgnoreCase("GetEmployeeById")) {
			GetEmployeeByIdController get = new GetEmployeeByIdController();
			System.out.println("Enter the employee id");
			int id = scan.nextInt();
			get.getById(id);
		}
		else if(Req.equalsIgnoreCase("GetAllEmployee")) {
			GetAllEmployeeController getall = new GetAllEmployeeController();
			getall.getAll();
		}
		else if(Req.equalsIgnoreCase("DeleteEmployee")) {
			DeleteEmployeeController del= new DeleteEmployeeController();
			del.deleteEmployee();
		}
		scan.close();
	}

}
