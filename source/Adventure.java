public class Adventure extends Holiday {

  private int difficulty;

  public Adventure(String location, int cost, String startDate int duration, int difficulty){
    super(location, cost, startDate, duration);
    this.difficulty = difficulty;
  }
}
