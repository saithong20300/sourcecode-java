package day5;

import java.util.Comparator;

final class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)((o2.getSalary())-o1.getSalary());
	}
}