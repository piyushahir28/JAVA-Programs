class Printer{

	private int tonnerLevel=100;
	private int noOfPages;
	private String isDuplex;

	public Printer(int tonnerLevel, int noOfPages, String isDuplex){
		this.noOfPages=noOfPages;
		if(tonnerLevel>=0 && tonnerLevel<=100)
			this.tonnerLevel=tonnerLevel;
		this.isDuplex=this.isDuplex;
	}

	public int gettonnerLevel(){
		return tonnerLevel;
	}
	public int getnoOfPages(){
		return noOfPages;
	}
	public String getisDuplex(){
		System.out.println("Htt");
		return isDuplex;
	}

	public void filltonnerLevel(int tonnerLevel){
		if((this.tonnerLevel+tonnerLevel)<=100){
			this.tonnerLevel=this.tonnerLevel+tonnerLevel;
		}else{
			System.out.println("Tonner is full");
		}
	}

	public void increasenoOfPages(int noOfPages){
		this.noOfPages=this.noOfPages+noOfPages;
	}
}

public class Encapsulation{
	public static void main(String[] args) {
		Printer obj = new Printer(50,40,"Yes");
		obj.gettonnerLevel();
		obj.filltonnerLevel(25);
		System.out.println("Tonner Level : "+obj.gettonnerLevel());
		obj.increasenoOfPages(80);
		obj.getnoOfPages();
		obj.getisDuplex();
	}
}