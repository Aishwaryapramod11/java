package demo;
class AreaCalculator{
	public void area(double radius) {
		double area = 3.14 *radius*radius;
		System.out.println("Area circle:"+area);
		
		
	}
	public void area(double l,double b) {
		double area =l*b;
		System.out.println("Area of rect:"+area);
	}
	public void area(float b,float h) {
		float area=0.5f*b*h;
		System.out.println("Area of tri:"+area);
	}
	public void area(int side) {
		int area = side*side;
		System.out.println("Area of square:"+area);
	}
}
public class Over {
	public static void main(String[]args) {
		AreaCalculator cal = new AreaCalculator();
		cal.area(5);
		cal.area(8.8,9.5);
		cal.area(7.7f,6f);
		cal.area(8);
	}
}
