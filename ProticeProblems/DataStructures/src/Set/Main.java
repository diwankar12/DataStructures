package Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

  private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
  private static Set<HeavenlyBody> planets = new HashSet<>();


  public static void main(String[] args) {


    HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
    solarSystem.put(temp.getName(),temp);
    planets.add(temp);

    HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
    solarSystem.put(tempMoon.getName(), tempMoon);
    temp.addMoon(tempMoon);

    for(HeavenlyBody planet :planets){
      System.out.println(planet.getName());
    }

    HeavenlyBody body = solarSystem.get("Mercury");
    System.out.println("Moons of " + body.getName());
    for(HeavenlyBody jupiterMoon: body.getSatellites()) {
      System.out.println("\t" + jupiterMoon.getName());
    }


  }

}
