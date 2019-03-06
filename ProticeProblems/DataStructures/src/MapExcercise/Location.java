package MapExcercise;

import java.util.HashMap;
import java.util.Map;

public class Location {

  private final Integer locationId ;
  private final String description ;
  private final Map<String,Integer> exits ;

  public Location(Integer locationId, String description) {
    this.locationId = locationId;
    this.description = description;
    this.exits = new HashMap();
    this.exits.put("Q", 0);
  }

  public void addExit(String direction, int location) {
    exits.put(direction, location);
  }


  public Integer getLocationId() {
    return locationId;
  }

  public Map<String, Integer> getExits() {
    return exits;
  }

  public String getDescription() {

    return description;
  }


}
