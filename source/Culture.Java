public class Culture extends Holiday {

  private boolean lecture;
  private String[] aspects;

  public Culture(Admin admin, String location, int cost, String startDate int duration, boolean lecture String... aspects){
    super(admin, location, cost, startDate, duration);
    this.lecture = lecture;
    this.aspects = aspects;
  }

  public isLecture(){
    return lecture;
  }

  public String[] aspects(){
    return aspects;
  }
}
