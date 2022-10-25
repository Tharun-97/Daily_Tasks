package org.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSort {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "Tharun", 24, 16000));
		emp.add(new Employee(2, "Vignesh", 25, 16400));
		emp.add(new Employee(3, "Karuppasamy", 24, 15500));
		
		Collections.sort(emp);
		for (Employee e : emp) {
			System.out.println(e.id+" "+e.name +" "+e.age+" "+ e.salary);
		}
		
	}

}
