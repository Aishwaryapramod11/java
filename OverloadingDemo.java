package demo;
class Calculator{
	public void add(int a,int b){
		int add=a+b;
		System.out.println("Add two integers:"+add);
		
	}
	public void add(int a,int b,int c) {
		int add=a+b+c;
		System.out.println("Add three:"+add);
	}
	public void add(double a,double b) {
		double add=a+b;
		System.out.println("Add double integers:"+add);
		
	}
	public void add(String a,int b) {
		String add= a+b;
		System.out.println("add:"+add);
	}
}
public class OverloadingDemo {
	public static void main(String[]args) {
		Calculator calculator =new Calculator();
		calculator.add(5, 1);
		calculator.add(0,4,6);
		calculator.add(4.9, 5.8000);
		calculator.add("hi",5);
	}

}
