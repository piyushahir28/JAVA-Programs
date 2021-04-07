class HameBurger{
	private double price;
	private String BreadRoleType;
	private boolean meat;
	private boolean lettuce;
	private boolean tomato;
	private boolean carrot;

	public HameBurger(String BreadRoleType, double price, boolean meat){
		this.BreadRoleType=BreadRoleType;
		this.price=price;
		this.meat=meat;
	}

	public double totalPrice(){
		//this.price = 70d;
		if(meat)
			this.price+=50;
		if(lettuce)
			this.price+=30;
		if(tomato)
			this.price+=10;
		if(carrot)
			this.price+=20;

		return price;
	}
}

class HealthyBurger extends HameBurger{
	//private String BreadRoleType;
	private boolean cheese;
	private boolean mozarrela;

	public HealthyBurger(String BreadRoleType, double price, boolean meat){
		super("Brown Rye Bread",price,meat);
	}

	public double totalPrice(){
		this.price=price+70;
		super.totalPrice();
	}
}

class DeluxBurger extends HameBurger{
	private boolean chips;
	private boolean Drinks;

	public DeluxBurger(String BreadRoleType, double price, boolean meat){
		super(BreadRoleType,price,meat);
	}

	public double totalPrice(){
		if(chips)
			this.price+=30;
		if(Drinks)
			this.price+=45;
		
		super.totalPrice();
	}
}

public class OopChallenge{
	public static void main(String[] args) {
		
	}
}