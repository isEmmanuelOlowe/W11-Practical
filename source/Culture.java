import java.time.LocalDate;

public class Culture extends Holiday {

  private boolean lecture;
  private String[] aspects;

  public Culture(Admin admin, String location, int cost, LocalDate startDate, int duration, boolean lecture, String[] aspects){
    super(admin, location, cost, startDate, duration);
    this.lecture = lecture;
    this.aspects = aspects;
  }

  public boolean isLecture(){
    return this.lecture;
  }

  public String[] getAspects(){
    return this.aspects;
  }


  //Prints all the info of Culture Holidayspublic class Adventure extends Holiday {
  public void printAll(){
    super.printAll();
    System.out.print("|" + lecture);
    String sAspects = "";
    //strings all the aspects
    for(int i = 0; i < this.aspects.length; i++){
      sAspects += this.aspects[i] + ", ";
    }
    sAspects = sAspects.substring(0, sAspects.length() - 2);
    System.out.println("|" + sAspects + "|");
  }
}
