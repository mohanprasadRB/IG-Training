package com.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);

		// Ascending order
		Collections.sort(list);
		System.out.println(list);

		// Descending Order
		Collections.reverse(list);
		System.out.println(list);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "MOHAN", 28, 90000));
		employees.add(new Employee(102, "ROHAN", 29, 70000));
		employees.add(new Employee(104, "SOHAN", 30, 80000));
		employees.add(new Employee(103, "JOHAN", 26, 60000));

		// Using Comparator
		System.out.println("Before sort\n" + employees);
		Collections.sort(employees, new Mysort());
		System.out.println("after sort\n" + employees);

		// using Anonymous Implementation
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() > o2.getSalary() ? -1 : o1.getSalary() < o2.getSalary() ? 1 : 0;
			}
		});

		// using lambdaFunction
		System.out.println("Descending Order\n" + employees);
		Collections.sort(employees, (o1, o2) -> o1.getAge() > o2.getAge() ? 1 : o1.getAge() < o2.getAge() ? -1 : 0);
		System.out.println(employees);

		// Sorting by name
		Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(employees);

		employees.stream().filter(q -> q.getSalary() > 60000 && q.getAge() > 27)
				.forEach(s -> System.out.println(s.getName() + " " + s.getAge() + " " + s.getSalary()));
	}
}

class Mysort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSalary() > o2.getSalary() ? 1 : o1.getSalary() < o2.getSalary() ? -1 : 0;
	}

}
