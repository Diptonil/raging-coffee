package com.ragingcoffee.designpatterns.prototype;

import java.util.ArrayList;

final class Employee implements Cloneable {

	private ArrayList<String> employee;
	
	public Employee(){
		employee = new ArrayList<String>();
	}
	
	public Employee(ArrayList<String> list) {
		this.employee=list;
	}

	public void loadData(){
		employee.add("Lucius Fox");
		employee.add("Dr. Otto Schivel");
		employee.add("Nora");
		employee.add("Lucas Fox");
	}
	
	public ArrayList<String> getList() {
		return employee;
	}

	public void add(String name) {
		employee.add(name);
	}

	public void remove(String name) {
		employee.remove(name);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
        ArrayList<String> temp = new ArrayList<String>();
        for(String s : this.getList()) {
            temp.add(s);
        }
        return new Employee(temp);
	}
}

public final class EmployeeCategoriser {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employeeWayneEnterprises = new Employee();
		employeeWayneEnterprises.loadData();

		Employee employeeBatFamily = (Employee) employeeWayneEnterprises.clone();
		employeeBatFamily.remove("Nora");
		employeeBatFamily.remove("Dr. Otto Schivel");
		employeeBatFamily.add("Alfred");
		employeeBatFamily.add("Commissioner Gordon");

		System.out.println("The original object (employees at Wayne Enterprises): " + employeeWayneEnterprises.getList());
		System.out.println("The cloned object (employees (well, not really...) at Batfamily): " + employeeBatFamily.getList());
	}
}