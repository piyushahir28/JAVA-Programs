import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;

class HeavenlyBody{
	private final String name;
	private final double orbitalPeriod ;
	private final Set<HeavenlyBody> satellites;
	private BodyType bodyType;

	public enum BodyType{
		STAR,
		PLANET,
		DWARF_PLANET,
		MOON,
		COMIT,
		ASTEROID
	}

	public HeavenlyBody(String name, double orbitalPeriod){
		this.name=name;
		this.orbitalPeriod=orbitalPeriod;
		this.satellites= new HashSet<>();
	}

	public String getName(){
		return name;
	}

	public double getOrbitalPeriod(){
		return orbitalPeriod;
	}

	public boolean addMooon(HeavenlyBody moon){
		return this.satellites.add(moon);
	}

	public Set<HeavenlyBody> getSatellites(){
		return new HashSet<>(this.satellites);
	}

	public BodyType getBodyType(){
		return bodyType;
	}

	@Override
	public final boolean equals(Object obj){
		if (this==obj) {
			return true;
		}

		if (obj instanceof HeavenlyBody) {
			HeavenlyBody theObject = (HeavenlyBody)obj;
			if (this.name.equals(theObject.getName())) {
				return this.bodyType == theObject.getBodyType();
			}
		}
		return false;
	}

	@Override
	public final int hashCode(){
		return this.name.hashCode();
		// + 57 + this.bodyType.hashCode();
	}

	@Override
	public String toString(){
		return this.name + " : " + this.bodyType + " , " + this.orbitalPeriod;
	}
}

public class Sets{
	private static Map<String, HeavenlyBody	> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		HeavenlyBody temp = new HeavenlyBody("Mercury",88);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);

		temp = new HeavenlyBody("Earth",365);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);

		HeavenlyBody tempMoon = new HeavenlyBody("Moon",27);
		solarSystem.put(tempMoon.getName(),tempMoon);
		temp.addMooon(tempMoon);

		temp = new HeavenlyBody("Venus",225);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);

		temp = new HeavenlyBody("Mars",687);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);			
	
		tempMoon = new HeavenlyBody("Deimos",1.3);
		solarSystem.put(tempMoon.getName(),tempMoon);
		temp.addMooon(tempMoon);

		tempMoon = new HeavenlyBody("Phobos",0.3);
		solarSystem.put(tempMoon.getName(),tempMoon);
		temp.addMooon(tempMoon);

		temp = new HeavenlyBody("Jupiter",4332);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);	

		tempMoon = new HeavenlyBody("Io",1.8);
		solarSystem.put(tempMoon.getName(),tempMoon);
		temp.addMooon(tempMoon);

		tempMoon = new HeavenlyBody("Europa",3.5);
		solarSystem.put(tempMoon.getName(),tempMoon);
		temp.addMooon(tempMoon);
		
		tempMoon = new HeavenlyBody("Ganymede",7.1);
		solarSystem.put(tempMoon.getName(),tempMoon);
		temp.addMooon(tempMoon);

		tempMoon = new HeavenlyBody("Callisto",16.7);
		solarSystem.put(tempMoon.getName(),tempMoon);
		temp.addMooon(tempMoon);
	
		temp = new HeavenlyBody("Satrun",10759);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);

		temp = new HeavenlyBody("Uranus",30660);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);

		temp = new HeavenlyBody("Neptune",165);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);

		temp = new HeavenlyBody("Pluto",248);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);

		System.out.println("Planets");
		for(HeavenlyBody h : planets){
			System.out.println("\t" + h.getName());
		}

		Set<HeavenlyBody> moons = new HashSet<>();
		for (HeavenlyBody planet : planets) {
			System.out.println(planet);
			//moons.addAll(planet.getSatellites());
		}
	}
}