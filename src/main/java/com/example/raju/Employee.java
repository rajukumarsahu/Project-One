package com.example.raju;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Employee {
	
	@NonNull
	private Integer empid;
	@NonNull
	private String empname;

	
	//public Employee (Integer empid,String empname) {
	//	super();
		//this.empid=empid;
	//	this.empname=empname;
	//}
}
