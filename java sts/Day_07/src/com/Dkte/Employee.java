package com.Dkte;

public class Employee {

	private int empid;
	private String ename;
	private double salary;
	
	
	public Employee()
	{}
	
	public Employee(int empid, String ename, double salary) 
	{
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	public boolean equals(Object obj){
		
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Employee)
		{
			Employee e=(Employee)obj;
			if(this.empid==e.empid && this.ename==e.ename && this.salary==e.salary)
				return true;
			
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ",]";
	}
	
}
