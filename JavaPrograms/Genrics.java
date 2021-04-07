import java.util.ArrayList;

abstract class Player{
	private String name;

	public Player(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	} 
}
class Foolball extends Player{
	public Foolball(String name){
		super(name);
	}
}
class Team<T extends Player> implements Comparable<Team<T>>{
	private String name;
	int win=0,loss=0,tied=0;
	ArrayList<T> list = new ArrayList<T>();

	public Team(String name){
		this.name=name;
	} 

	public boolean addTeam(T team){
		if (list.contains(tem)) {
			System.out.println(team.getName() + " Already Exist")
			return false;
		}else{
			list.add(team);
			System.out.println(team.getName() + " Added");
			return true;	
		}
	}

	public int noOfPlayers(){
		return this.list.size();
	}

	public void matchResults(T opponent, int ourScore, int theirScore){
		String message;
		if(ourScore<theirScore){
			loss++;
			message = " lost to ";
		}else if (ourScore>theirScore) {
			win++;
			message = " beat ";
		}else{
			tied++;
			message = " tied to";
		}
		if (opponent!=null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResults(null,theirScore,ourScore);
		}
	}

	public int ranking(){
		return (won*2)+tied;
	}

	@Override
	public int compareTo(Team<T> team){
		if (this.ranking()>team.ranking()) {
			return -1;
		}else if (this.ranking()<team.ranking()) {
			return 1;
		}else{
			return 0;
		}
	}
}

class Leauge<T extends Team>{
	private String name;
	private ArrayList<T> members = new ArrayList<T>();

	public Leauge(String name){
		this.name=name;
	} 

	public boolean addLeauge(T team){
		if (members.contains(team)) {
			System.out.println(team.getName() + "Aready Exist");
			return false;
		}else{
			members.add(team);
			System.out.println(team.getName() + " Added");
			return true;
		}
	}

	public void showLeaugeTable(){
		Collections.sort(members);
		for (T t : members) {
			System.out.println(t.getName() + " : " + t.ranking());
		}
	}
}
public class Genrics{
	public static void main(String[] args) {
		Cricket cricketPlayer = new Cricket("Piyush");; 
	}
}