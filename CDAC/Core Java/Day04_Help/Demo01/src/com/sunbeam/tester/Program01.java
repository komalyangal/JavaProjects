package com.sunbeam.tester;

import com.sunbeam.Employee;
import com.sunbeam.Manager;

public class Program01 {

	public static void main(String[] args) {
		Employee emp = new Manager(1, "Mukesh", 20000, 2000); // upcasting
		emp.display();

		Manager m = (Manager) emp; // Downcasting
		// emp.calculateTotalSalary(); //
		m.calculateTotalSalary();
	}

	public static void main1(String[] args) {
		Employee e1 = new Employee(1, "Anil", 10000);
		e1.display();
	}

}
