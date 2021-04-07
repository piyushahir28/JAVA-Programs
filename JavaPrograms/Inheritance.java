class Vehicle{
	private double speed;
	private int gears;
	private String stearing;

	public Vehicle(String stearing, int gears, double speed){
		this.stearing=stearing;
		this.gears=gears;
		this.speed=speed;
	}
	public void display(){
		System.out.println("Stearing is at "+stearing+" side.");
		System.out.println("It has "+gears+" gears.");
		System.out.println("Moves with"+speed+" Km/Hr.");
	} 
}
class Car extends Vehicle{
	public Car(String stearing, int gears, double speed){
	super(stearing,gears,speed);
	}
}
class BMW extends Car{
	public BMW(String stearing, int gears, double speed){
		super(stearing,gears,speed);
	}
}
public class Inheritance{
	public static void main(String[] args) {
		BMW obj = new BMW("Left",5,120.50);		
		obj.display();
	}
}