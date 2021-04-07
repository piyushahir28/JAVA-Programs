//Program on Composition 
class Dimensions{
	private int height;
	private int width;
	private int depth;

	public Dimensions(int height, int width, int depth){
		this.height=height;
		this.width=width;
		this.depth=depth;
	}

	public int getHeigth(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public int getdepth(){
		return depth;
	}

}

class Resolution{
	private int width;
	private int height;

	public Resolution(int height, int width){
		this.height=height;
		this.width=width;
	}

	public int getHeigth(){
		return height;
	}
	public int getWidth(){
		return width;
	}
}

class Case{
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions;

	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions){
		this.model=model;
		this.manufacturer=manufacturer;
		this.powerSupply=powerSupply;
		this.dimensions=dimensions;
	}

	public void pressPowerButton(){
		System.out.println("Power Button Pressed");
	}

	public String getModel(){
		return model;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public String getpowerSupply(){
		return powerSupply;
	}
	public Dimensions getdimensions(){
		return dimensions;
	}
}

class Monitor{
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;

	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution){
		this.model=model;
		this.manufacturer=manufacturer;
		this.size=size;
		this.nativeResolution=nativeResolution;
	}

	public void drawPixelAt(int x, int y, String color){
		System.out.println("Deawing pixel at "+x+","+y+" in "+color+"Colour");
	}

	public String getModel(){
		return model;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public int getSize(){
		return size;
	}
	public Resolution getnativeResolution(){
		return nativeResolution;
	}
}

class Motherboard{
	private String model;
	private String manufacturer;
	private int ramslots;
	private int cardslots;
	private String bios;

	public Motherboard(String model, String manufacturer, int ramslots, int cardslots, String bios){
		this.model=model;
		this.manufacturer=manufacturer;
		this.ramslots=ramslots;
		this.cardslots=cardslots;
		this.bios=bios;
	}
	
	public void LoadProgram(String programName){
		System.out.println("Program "+programName+" is loading");
	}

	public String getModel(){
		return model;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public int getramslots(){
		return ramslots;
	}
	public int getcardslots(){
		return cardslots;
	}
	public String getbios(){
		return bios;
	}
}

class PC{
	private Case thecase;
	private Monitor monitor;
	private Motherboard motherboard;

	public PC(Case thecase, Monitor monitor, Motherboard motherboard){
		this.thecase=thecase;
		this.monitor=monitor;
		this.motherboard=motherboard;
	}

	public Case getthecase(){
		return thecase;
	}
	public Monitor getmonitor(){
		return monitor;
	}
	public Motherboard getmotherboard(){
		return motherboard;
	}
}

public class CompositionSample{
	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20,20,5);
		Case thecase = new Case("220B","Dell","240",dimensions);
		Monitor theMonitor = new Monitor("27inch Based","Acer",27,new Resolution(2540,1440));
		Motherboard theMotherboard = new Motherboard("BJ-200","Assus",4,6,"V2.44");
		PC obj = new PC(thecase,theMonitor,theMotherboard);

		obj.getmonitor().drawPixelAt(5,5,"Yellow");
		obj.getmotherboard().LoadProgram("Pappu");
		obj.getthecase().pressPowerButton();
	}
}