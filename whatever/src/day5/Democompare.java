package day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Democompare {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(1, "A", 100));
		employee.add(new Employee(2, "B", 50));
		employee.add(new Employee(3, "C", 200));
		
		//sort by salary descending
		Comparator<Employee> bySalaryDesc = (o1, o2) -> (int)(o2.getSalary()-o1.getSalary());
		Collections.sort(employee, bySalaryDesc);
		employee.forEach(System.out::println);
	}
	
}

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}