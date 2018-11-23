public class Adventure extends Holiday {

  private int difficulty;

  public Adventure(Admin admin, String location, int cost, String startDate int duration, Guide guide, int difficulty){
    super(admin, location, cost, startDate, duration);
    this.guide = guide;
    this.difficulty = difficulty;
  }

  public int getDifficulty(){
    return this.difficulty;
  }
}
