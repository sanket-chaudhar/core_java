package Filehandling;

import java.io.Serializable;

  public class Employee implements Serializable{
private int empid;
private String empName;
private double empSal;
public Employee() {
	super();
	
	
}
public Employee(int empid, String empName,double empSal) {
	super();
	this.empid=empid;
	this.empName=empName;
	this.empSal=empSal;
	
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + "]";
}

}