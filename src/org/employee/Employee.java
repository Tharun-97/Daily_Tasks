package org.employee;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;
	int salary;

	Employee(int id, String name, int age, int salary) {
		this.age = age;
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public int compareTo(Employee e) {
		if (salary == e.salary) {
			return 0;
		} else if (salary > e.salary) {
			return 1;

		} else {
			return -1;
		}
		
	}
	
}
