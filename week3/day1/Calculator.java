package week3.day1;

public class Calculator {
	
	public void addition(int a, int b) {
		int c=a+b;
		System.out.println("Addition1:" +c);

	}
	
	public void addition(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Addition2:" +d);

	}
	
	public void multiply(int a, int b) {
		int e=a*b;
		System.out.println("Multiplication1:"+e);
		

	}
	public void multiply(int a, double b) {
		double f=a*b;
		System.out.println("Multiplication2:"+f);
		

	}
	
	public void subtraction(int a, int b) {
		int g = a-b;
		System.out.println("Subtraction1:"+g);

	}
	public void subtraction(double a, double b) {
		double h = a-b;
		System.out.println("Subtraction1:"+h);

	}
	
	public void divide(int a, int b) {
		int i = a/b;
		System.out.println("Division1:"+i);

	}
	public void divide(double a, int b) {
		double j = a/b;
		System.out.println("Division1:"+j);

	}
	

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.addition(10, 20);
		cal.addition(10, 100, 50);
		cal.multiply(5, 10);
		cal.multiply(10, 50.007);
		cal.subtraction(100, 50);
		cal.subtraction(1001.0023, 500.86233);
		cal.divide(50, 5);
		cal.divide(100.7656243, 2);

	}

}
