//Generalised class for a holiday
public class Holiday {
  //The unique identifier for a holiday
  private static int noHolidays = 0;
  private int holidayID;
  private Admin admin;
  private String location;
  private int cost;
  private String startDate;
  private int duration;

  public Holiday(Admin admin, String location, int cost, String startDate int duration){
    this.admin = admin;
    this.holidayID = noHolidays;
    this.location = location;
    this.cost = cost;
    this.startDate = startDate;
    this.duration = duration;

    noHolidays++;
  }

  public Admin getAdmin(){
    return this.admin;
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

  public int getID(){
    return this.holidayID;
  }
}
