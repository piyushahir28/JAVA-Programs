public class VipCustomer{
	
	private String email,name;
	private double creditlimit;
	public VipCustomer(){
		this("Piyush","piyush@gmail.com",500000d);
	}
	public VipCustomer(String name, String email, double creditlimit){
		this(400000d,email,name);
		this.name=name;
		this.email=email;
		this.creditlimit=creditlimit;	
	}
	public VipCustomer(double creditlimit, String email, String name){
		this.name=name;
		this.email=email;
		this.creditlimit=creditlimit;
	}
	public void getters(){
		System.out.println("Details are : ");
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Credit Limit : "+creditlimit);
	}
}