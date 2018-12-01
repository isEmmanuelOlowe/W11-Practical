import java.time.LocalDate;
//Generalised class for a holiday
public class Holiday {
  //The unique identifier for a holiday
  private static int noHolidays = 0;
  private int holidayID;
  private Admin admin;
  private String location;
  private int cost;
  private LocalDate startDate;
  private int duration;

  public Holiday(Admin admin, String location, int cost, LocalDate startDate, int duration){
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

  public LocalDate getDate(){
    return this.startDate;
  }

  public int duration(){
    return this.duration;
  }

  public int getID(){
    return this.holidayID;
  }

  //prints all the data of the object
  public void printAll(){
    System.out.print("|" + this.holidayID);
    System.out.print("|" + this.admin.getName());
    System.out.print("|" + this.location);
    System.out.print("| £" + (float)this.cost/100);
    System.out.print("|" + this.startDate.toString());
    System.out.print("|" + this.duration);
  }

  //determines if a holiday falls within a certain range
  public boolean inRange(LocalDate period){
    if(this.startDate.minusDays(1).isBefore(period) && this.startDate.plusDays(this.duration).isAfter(period)){
      return true;
    }
    return false;
  }
}
