package com.sunbeam.tester;

import com.sunbeam.Employee;
import com.sunbeam.Manager;
import com.sunbeam.Salesman;

public class Program02 {

	public static void main(String[] args) {
		Employee emp;
		// emp = new Manager(1, "Anil", 10000, 500); // upcasting
		emp = new Salesman(2, "Mukesh", 20000, 10, 50); // upcasting
		emp.display();

		if (emp instanceof Salesman) {
			Salesman sm = (Salesman) emp; // Downcasting
			sm.calculateTotalCommission();
		} else {
			Manager m = (Manager) emp;
			m.calculateTotalSalary();
		}
	}

}
