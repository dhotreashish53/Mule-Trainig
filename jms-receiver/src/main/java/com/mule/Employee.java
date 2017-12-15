package com.mule;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private Boolean enabled;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary, Boolean enabled) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.enabled = enabled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	
	
	
	
}
