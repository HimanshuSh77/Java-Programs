package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithComplexObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "IT", 75000, Arrays.asList("Java", "Spring", "AWS")),
			    new Employee(102, "Bob", "HR", 50000, Arrays.asList("Communication", "Recruitment")),
			    new Employee(103, "Charlie", "IT", 80000, Arrays.asList("Java", "Docker")),
			    new Employee(104, "David", "Finance", 60000, Arrays.asList("Excel", "Finance Modeling")),
			    new Employee(105, "Eva", "IT", 90000, Arrays.asList("Java", "Spring Boot", "Microservices"))
			);
		
		// filter emp with department
		List<Employee> filteredemployees=employees.stream()
				.filter(e-> e.getDepartment().equalsIgnoreCase("it")).collect(Collectors.toList());
		System.out.println(filteredemployees);

		//filter with salary
		List<String> filteredemployees1=employees.stream()
				.filter(e-> e.getSalary()>80000).map(emp->emp.getName()+"-"+emp.getSalary()).collect(Collectors.toList());
		System.out.println(filteredemployees1);
		
		//Sort with salary
				List<Employee> sortedemployees=employees.stream()
						.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
				System.out.println(sortedemployees);

	}

}
