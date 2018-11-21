//Generalised class for a holiday
public class Holiday {
  //The unique identifier for a holiday
  private static int holidayID = 0;

  private String location;
  private int cost;
  private String startDate;
  private int duration;

  public Holiday(String location, int cost, String startDate int duration){

    this.location = location;
    this.cost = cost;
    this.startDate = startDate;
    this.duration = duration;
    holidayID++;
  }

  public String getLocation(){
    return this.location;
  }
  public int getCost(){
    return this.cost;
  }
  public String startDate(){
    return this.startDate;
  }
  public int duration(){
    return this.duration;
  }
}
