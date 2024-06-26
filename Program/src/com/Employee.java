package com;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	private String address;



	public Employee(int empId, String name, double salary, String address) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee) obj;
		return this.empId==e.empId && this.name.equals(e.name) &&
				this.salary==e.salary;
	}








}
