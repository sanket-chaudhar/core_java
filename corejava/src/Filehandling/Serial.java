package Filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
public static void main(String[] args) {
	String filepath="C:\\Users\\sanke\\Desktop\\file.txet";
	try {
		FileOutputStream fout=new FileOutputStream(filepath);
		
		ObjectOutputStream about=new ObjectOutputStream(fout);
		Employee emp=new Employee(123,"ravi",54600);
		about.writeObject(emp);
		System.out.println("object store in to yhe file succecssfully!!");
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
