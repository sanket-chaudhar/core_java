package exceptionhandaling;

public class Trycatch {
	public static void main (String [] args) {
		String name=null;
		int a=45;
		int b=0;
		System.out.println("stetment 1");
		try {
			try {
			System.out.println("statement 2"+a/b);
			System.out.println("statement 3"+name.length());
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("stetment 4");
		System.out.println("stetment 5");
		System.out.println("stetment 6");
		System.out.println("stetment 7");
		
	}

}
