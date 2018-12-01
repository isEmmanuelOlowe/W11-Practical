import java.time.LocalDate;

public class Relaxation extends Holiday {

  private String amenities;

  public Relaxation(Admin admin, String location, int cost, LocalDate startDate, int duration, String amenities){
    super(admin, location, cost, startDate, duration);
    this.amenities = amenities;
  }

  public String getAmenities(){
    return this.amenities;
  }

  //prints all the objects data
  public void printAll(){
    super.printAll();
    System.out.println("|" + this.amenities + "|");
  }
}
