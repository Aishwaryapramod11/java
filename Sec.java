package mod2;
class Vehicle {
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void Display() {
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
		
	}
}
class Car extends Vehicle{
	String fuel;
	Car(String brand,String model,String fuel){
		super(brand,model);
		this.fuel=fuel;
	}
	public void Display() {
		super.Display();
		System.out.println("fuel:"+fuel);
	}
	
	
}
class Electric extends Car{
	double Battery;
	Electric (String brand,String model,String fuel,double battery){
		super(brand,model,fuel);
		this.Battery=battery;
		
	}
	public void Display() {
		super.Display();
	    System.out.println("battery:"+Battery);
	}
}

public class Sec {
	  public static void main(String[]args) {
      Electric electric =new Electric("Kia","Ev6","electric",84);
      electric.Display();
      System.out.println();
}
}
