package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(101, "ranjitha", "developer", 17),
				new Employee(102, "suma", "tester", 22),
				new Employee(103, "rakshitha", "architecture", 33),
				new Employee(107, "rakshi", "developer", 13));
		
		Employee e=list.get(0);
		for(int i=1;i<list.size();i++){
			if(e.getAge()>list.get(i).getAge()){
				e=list.get(i);
			}
		}
		System.out.println(e);
		System.out.println("***************");

	
	Stream<Employee> stream =list.stream();

	Optional<Employee> min = stream.min(Comparator.comparing(Employee::getAge));
	System.out.println(min);
	
	System.out.println("***************");
	list.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
	
	System.out.println("*********************");
	List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getEmployeeName)).collect(Collectors.toList());
	collect.forEach(System.out::println);
	
	System.out.println("*********************");
	
	List<Employee> collect2 = list.stream().sorted(Comparator.comparing(Employee::getEmployeeId)).collect(Collectors.toList());
	collect.forEach(System.out::println);
	
	System.out.println("*****************");
	
	Map<String, List<Employee>> collect3 = list.stream().collect(Collectors.groupingBy(Employee::getDesignation));//groupingby method from Map
	collect3.forEach((designation,emp)->{
		System.out.println(designation);
		emp.forEach(System.out::println);
	});
	System.out.println("***************************");
	List<Employee> collect4 = list.stream().filter(em->em.getAge()>20).collect(Collectors.toList());
	collect4.forEach(System.out::println);
	System.out.println("***************************");
	
	list.stream().filter(em->em.getEmployeeId()>100).collect(Collectors.toList()).forEach(System.out::println);
	
	System.out.println("*************************************************************");
	boolean anyMatch = list.stream().anyMatch(em->em.getAge()<20);
	System.out.println(anyMatch);
	
}
}