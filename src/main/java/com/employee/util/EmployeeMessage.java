package com.employee.util;

import org.springframework.stereotype.Component;

@Component
public class EmployeeMessage {
	public String getMessage(boolean isDeleted, Integer Id) {
		if(isDeleted) {
			String msg = Id +"is deleted";
			return msg;
		}
		else {
			String msg = Id +"is not present for delete";
			return msg;
		}
	}
		
}
