package innerclass;

public class Outer {
	private int a;
	
	public void outerMethod() {
		System.out.println("method from outer class");
		
	}
	class Inner{
		private int b;
		public void InnerMethod()
		{
			System.out.println("method from inner class"+a);
		}	}
	

}