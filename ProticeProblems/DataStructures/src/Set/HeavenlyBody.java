package Set;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

  private final String name ;
  private final double orbitanalPeriod ;
  private final Set<HeavenlyBody> satellites ;

  public HeavenlyBody(String name, double orbitanalPeriod) {
    this.name = name;
    this.orbitanalPeriod = orbitanalPeriod;
    this.satellites = new HashSet<>();
  }

  public String getName() {
    return name;
  }

  public double getOrbitanalPeriod() {
    return orbitanalPeriod;
  }

  public Set<HeavenlyBody> getSatellites() {
    return new HashSet<>(this.satellites);
  }


public boolean addMoon(HeavenlyBody moon){

    return this.satellites.add(moon);

}

}
