package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainEmployee {
public static void main(String[] args) {
	
	try {
		Class empClass=Class.forName("Reflection.Employee");
		System.out.println("Class Name:"+empClass.getName());
		System.out.println("SuperClass:"+empClass.getSuperclass());
		
		System.out.println("Fields of Employee");
		
		Field[] fields=empClass.getDeclaredFields();
		for (Field field:fields) {
			System.out.println("Field Name"+field.getName()+"\tdata type:"+field);
			
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		
		System.out.println("Method of employee");
		Method[] Methods=empClass.getDeclaredMethods();
		for(Method method: methods){
			System.out.println("Method Name :"+ method.getName()+"\tReturn Type:"+method.getReturnType());
			
		}
	}
}
}