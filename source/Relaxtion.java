public class Relaxation extends Holiday {

  private String amenities;

  public Relaxation(Admin admin, String location, int cost, String startDate int duration, String amenities, boolean lecture){
    super(admin, location, cost, startDate, duration);
    this.amenities = amenities;
  }

}
