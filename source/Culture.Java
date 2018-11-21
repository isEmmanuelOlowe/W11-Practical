public class Culture extends Holiday {

  private boolean lecture;
  private String[] aspects;

  public Culture(String location, int cost, String startDate int duration, boolean lecture String... aspects){
    super(location, cost, startDate, duration);
    this.lecture = lecture;
    this.aspects = aspects;
  }

}
