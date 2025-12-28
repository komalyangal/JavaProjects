package com.sunbeam;

public class Employeee {
	int empid;
	String name;
	double salary;

	public Employeee() {
		// TODO Auto-generated constructor stub
	}

	public Employeee(int empid) {
		this.empid = empid;
	}

	public Employeee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Employeee) {
			Employeee e = (Employeee) obj;
			if (this.empid == e.empid)
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employeee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}
