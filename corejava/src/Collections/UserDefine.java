package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Reflection.Employee;

public class UserDefine {
public static void main(String[] args) {
	List<Employee>empList=new ArrayList<Employee>();
	
	Employee emp1=new Employee(123,"sagar",5600);
	empList.add(emp1);
	
	empList.add(new Employee(13,"prasad",5688));
	empList.add(new Employee(145,"sanket",6547));
	
	Employee emp4=new Employee(125,"abhi",3454);
	Employee emp5=new Employee(51,"ravi",4900);
	empList.add(emp4);
	empList.add(emp5);
	
	System.out.println("+++++++++++unsorted employee+++++++");
	
	
	for(Employee emp:empList) {
		System.out.println(emp);
		
}
	System.out.println("++++++++++++++++++++++++=================");
//	
//	Collections.sort (empList);
//	System.out.println("sorted employee list by id");
//	
//	
	Collections.sort(empList);
	System.out.println("sorted by salary");
	
	
	for(Employee emp :empList) {
		System.out.println(emp);
		
		
	}
	
	
	
}
}