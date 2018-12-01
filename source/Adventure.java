import java.time.LocalDate;

public class Adventure extends Holiday {

  private Level difficulty;
  private Guide guide;

  public Adventure(Admin admin, String location, int cost, LocalDate startDate, int duration, Guide guide, Level difficulty){
    super(admin, location, cost, startDate, duration);
    this.guide = guide;
    this.difficulty = difficulty;
  }

  public Guide getGuide(){
    return this.guide;
  }
  public Level getDifficulty(){
    return this.difficulty;
  }
  public void printAll(){
    super.printAll();
    System.out.print("|" + this.guide.getName());
    System.out.println("|" + this.difficulty + "|");
  }
}
