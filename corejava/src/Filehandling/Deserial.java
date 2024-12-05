package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
public static void main(String[] args) {
	String filepath="C:\\Users\\sanke\\Desktop\\file.txt";
	try {
		FileInputStream in=new FileInputStream(filepath);
		ObjectInputStream obin=new ObjectInputStream(in);
		
		Employee emp=(Employee) obin.readObject();
	System.out.println(emp);
	
	}catch(IOException | ClassNotFoundException s) 
	{
		s.printStackTrace();
	}
	
	
}
}