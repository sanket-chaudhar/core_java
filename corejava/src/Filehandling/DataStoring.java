package Filehandling;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataStoring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("type here !!!!");
	String data=sc.nextLine();
	
	try {
		String filepath="C:\\Users\\sanke\\Desktop\\file.txt";
		FileOutputStream fout=new FileOutputStream(filepath);
		fout.write(data.getBytes());
		System.out.println("data store in to the file successfully");
			
	}catch(IOException e) {
		e.printStackTrace();
	}
}

}
