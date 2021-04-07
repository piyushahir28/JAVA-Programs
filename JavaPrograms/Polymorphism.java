class Car{
	private String name;
	private int cylinder;
	private int wheels;
	private boolean engine;

	public Car(String name, int cylinder){
		this.name=name;
		this.cylinder=cylinder;
		this.wheels=4;
		this.engine=true;
	}

	public String getname(){
		return name;
	}
	public int getcylinder(){
		return cylinder;
	}
	public int getwheels(){
		return wheels;
	}
	public boolean getengine(){
		return engine;
	}

	public void startEngine(){
		System.out.println("Engine gets Starts now");
	}
	public void accelerate(){
		System.out.println("Car gets Accelerates now");
	}
	public void brake(){
		System.out.println("Brakes Applied");
	}
}

class Fortuner extends Car{
	public Fortuner(String name, int cylinder){
		super(name,cylinder);
	}

	public void startEngine(){
		System.out.println("Fortuner's Engine gets Starts now");
	}
	@Override
	public void accelerate(){
		System.out.println("Fortuner Car gets Accelerates now");
	}
	public void brake(){
		System.out.println("Fortuner's Brakes Applied");
	}
}
class Baleno extends Car{
	public Baleno(String name, int cylinder){
		super(name,cylinder);
	}

	public void startEngine(){
		System.out.println("Baleno's Engine gets Starts now");
	}
	public void accelerate(){
		System.out.println("Baleno Car gets Accelerates now");
	}
	public void brake(){
		System.out.println("Baleno's Brakes Applied");
	}
}
class Scorpio extends Car{
	public Scorpio(String name, int cylinder){
		super(name,cylinder);
	}

	/*public void startEngine(){
		System.out.println("Scorpio's Engine gets Starts now");
	}
	public void accelerate(){
		System.out.println("Scorpio Car gets Accelerates now");
	}
	public void brake(){
		System.out.println("Scorpio's Brakes Applied");
	}*/
}

public class Polymorphism{
	public static void main(String[] args) {
		
		for (int i=0; i<3; i++) {
			Car car = ourcar();
			System.out.println("Car Name : "+car.getname());
			System.out.println("Car cylinder : "+car.getcylinder());
			System.out.println("No. of wheels : "+car.getwheels());
			car.startEngine();
			car.accelerate();
			car.brake();
			System.out.println("");
		}
	}

	public static Car ourcar(){
		int randomNumber = (int) (Math.random()*3)+1;
		System.out.println("Random Number : "+randomNumber);
		System.out.println("");
		switch (randomNumber) {
			case 1:
				return new Fortuner("Fortuner",2);
			case 2:
				return new Baleno("Baleno",3);
			case 3:
				return new Scorpio("Scorpio",4);
		}
		return null;
	}
}