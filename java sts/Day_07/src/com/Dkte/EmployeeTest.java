package com.Dkte;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee (2,"saish",30000.0));
		emp.add(new Employee (4,"sakshi",70000.0));
		emp.add(new Employee (1,"komal",20000.0));
		emp.add(new Employee (3,"nikunj",50000.0));
		System.out.println("Size of the Employee is "+emp.size());
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		Employee e=new Employee (1,"komal",20000.0);
		System.out.println("Removed element "+emp.remove(e));
		System.out.println("After Removing element Employee's are:- ");
		for(Employee e1:emp)
		{
			System.out.println(e1);
		}
		boolean contain=true;
		Employee e2=new Employee (2,"saish",30000.0);
//		for(Employee ele:emp)
//		{
//			if(contain=ele.equals(e2))
//			{
//				System.out.println("Equal"+contain);
//			}
//		}
		System.out.println("Employee present "+emp.contains(e2));
	}

}
