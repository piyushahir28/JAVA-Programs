import java.util.Scanner;
import java.util.ArrayList;

interface Isaveable{
	ArrayList<String> write();
	void read(ArrayList<String> savedValues);
}
class monster implements Isaveable{
	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;

	public monster(String name, int hitPoints, int strength){
		this.name=name;
		this.hitPoints=hitPoints;
		this.strength=strength;
		this.weapon="Sword";
	}
}

public class InterFaceChallenge{
	public static void main(String[] args) {
			
		}	
}