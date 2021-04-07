import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Locations{
	private final String direction;
	private final int locationID;
	private final Map<String, Integer> exits; 

	public Locations(int locationID, String direction){
		this.locationID=locationID;
		this.direction=direction;
		this.exits= new HashMap<>();
		this.exits.put("Q",0);
	}

	public String getDirection(){
		return direction;
	}

	public int locationID(){
		return locationID;
	}

	public void addExits(String direction, int locationID){
		exits.put(direction, locationID);
	}

	public Map<String, Integer> getExits(){
		return new HashMap<>(exits);
	}
}

public class MapsProgram{
	
	private static Map<Integer, Locations> locations = new HashMap<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		locations.put(0, new Locations(0, "You are sitting in front of a computer learniig JAVA"));
		locations.put(1, new Locations(1, "You are standing at the end of a Road"));
		locations.put(2, new Locations(2, "You are at the top of a Hill"));
		locations.put(3, new Locations(3, "You are in a Building Now"));
		locations.put(4, new Locations(4, "You are in a belly beside a stream"));
		locations.put(5, new Locations(5, "You are in the Forest"));

		locations.get(1).addExits("W",2);
		locations.get(1).addExits("E",3);
		locations.get(1).addExits("S",4);
		locations.get(1).addExits("N",5);

		locations.get(2).addExits("N",5);

		locations.get(3).addExits("W",1);

		locations.get(4).addExits("N",1);
		locations.get(4).addExits("W",2);
	
		locations.get(5).addExits("S",1);
		locations.get(5).addExits("W",2);

		Map<String, String> vocabulary = new HashMap<>();
		vocabulary.put("QUIT", "Q");
		vocabulary.put("EAST", "E");
		vocabulary.put("WEST", "W");
		vocabulary.put("NORTH", "N");
		vocabulary.put("SOUTH", "S");

		int loc = 1;
		while(true){
			System.out.println(locations.get(loc).getDirection());
			if(loc==0)
				break;

			Map<String, Integer> exits = 	locations.get(loc).getExits();
			System.out.print("Available exits are : ");
			for(String exit : exits.keySet()){
				System.out.print(exit + " , ");
			}
			System.out.println();

			String direction = scanner.nextLine().toUpperCase();
			if(direction.length()>1){
				String[] word = direction.split(" ");
				for(String check : word){
					if (vocabulary.containsKey(check)) {
						direction = vocabulary.get(check);
						break;
					}
				}
			}

			if (exits.containsKey(direction)) {
				loc = 	exits.get(direction);
			}else{
				System.out.println("You cannot go in that direction");
			}
		}
	}
}