package com.EmployeeDaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.EmployeeController.AddEmployeeController;
import com.EmployeeController.DeleteEmployeeController;
import com.EmployeeController.UpdateEmployeeController;
import com.EmployeeDao.EmployeeDao;
import com.EmployeeEntity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addEmployee(EmployeeEntity employeeentity)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			Statement smt = con.createStatement();
			int id = employeeentity.getEmpId();
			String name = employeeentity.getName();
			String gender = employeeentity.getGender();
			float salary = employeeentity.getSalary();
			String query = "insert into employee (empId,empName,gender,salary) values ('"+id+"', '"+name+"','"+gender+"','"+salary+"')";
			boolean b = smt.execute(query);
			String s=Boolean.toString(b);
			String a= "false";
			if(a.equals(s)) {
				System.out.println("The employee details have been saved");
			}
			else {
				System.out.println("Some error occurs");
			}
		}
		catch(ClassNotFoundException e){
			System.out.println("class not found");
		}
		catch(SQLException e) {
			System.out.println("sql problem");
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to add more");
		String res = scan.next();
		if(res.equalsIgnoreCase("yes")){
			AddEmployeeController add = new AddEmployeeController();
			add.addEmployee();
		}
		else {
			System.out.println("Thank you...!!!  The given employee details have been saved");
		}
		scan.close();
	}

	@Override
	public void updateEmployee(EmployeeEntity employeeentity) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			Statement smt = con.createStatement();
			int id = employeeentity.getEmpId();
			String name = employeeentity.getName();
			String gender = employeeentity.getGender();
			float salary = employeeentity.getSalary();
			String query = "UPDATE employee SET empName = '"+name+"', gender = '"+gender+"', salary = '"+salary+"' WHERE (`empId` = '"+id+"')";
			boolean b =smt.execute(query);
			String s=Boolean.toString(b);
			String a= "false";
			if(a.equals(s)) {
				System.out.println("The employee details have been updated");
			}
			else {
				System.out.println("Some error occurs");
			}
		}
		catch(ClassNotFoundException e){
			System.out.println("class not found");
		}
		catch(SQLException e) {
			System.out.println("sql problem");
		}
		System.out.println("Do you want to update any more details");
		Scanner scan = new Scanner(System.in);
		String res = scan.next();
		if(res.equalsIgnoreCase("yes")) {
			UpdateEmployeeController update = new UpdateEmployeeController();
			update.updateEmployee();
		}
		else {
			System.out.println("Thank you....!!!!");
			scan.close();
		}
	}

	@Override
	public void deleteEmployee(int empId) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			Statement smt = con.createStatement();
			String query = "delete from employee where empId = "+empId;
			boolean b=smt.execute(query);
			String s=Boolean.toString(b);
			String a= "false";
			if(a.equals(s)) {
				System.out.println("The employee details have been deleted");
			}
			else {
				System.out.println("Some error occurs");
			}
		}
		catch(ClassNotFoundException e){
			System.out.println("class not found");
		}
		catch(SQLException e) {
			System.out.println("sql problem");
		}
		System.out.println("Do you want to delete any more details");
		Scanner scan = new Scanner(System.in);
		String res = scan.next();
		if(res.equalsIgnoreCase("yes")) {
			DeleteEmployeeController delete = new DeleteEmployeeController();
			delete.deleteEmployee();
		}
		else {
			System.out.println("Thank you....!!!!");
			scan.close();
		}
		
	}

	@Override
	public EmployeeEntity getEmployeeById(int empId){
		EmployeeEntity empent=null;
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			Statement smt = con.createStatement();
			String query = "select * from employee where empId = "+empId;
			ResultSet rs = smt.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt("empId");
				String name = rs.getString("empName");
				String gender = rs.getString("gender");
				float salary = rs.getFloat("salary");
				empent = new EmployeeEntity(id,name,gender,salary);
			}
			
		}
		catch(ClassNotFoundException e){
			System.out.println("class not found");
		}
		catch(SQLException e) {
			System.out.println("sql problem");
		}
		return empent;
	}

	@Override
	public EmployeeEntity[] getAllEmployee() {
		EmployeeEntity[] employeeentityarray = new EmployeeEntity[10];
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			Statement smt = con.createStatement();
			String query = "select * from employee";
			ResultSet rs = smt.executeQuery(query);
			int i =0;
			while(rs.next()) {
				int id = rs.getInt("empId");
				String name = rs.getString("empName");
				String gender = rs.getString("gender");
				float salary = rs.getFloat("salary");
				EmployeeEntity empent = new EmployeeEntity(id,name,gender,salary);
				employeeentityarray[i] = empent;
				i = i+1;
				if(i==9) {
					break;
				}
			}
		}
		
		catch(ClassNotFoundException e){
			System.out.println("class not found");
		}
		catch(SQLException e) {
			System.out.println("sql problem");
		}
		return employeeentityarray;
	}

}
