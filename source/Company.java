import java.time.LocalDate;

public class Company {

  private Staff[] staffMembers;
  private Holiday[] destinations;
  public Company(Staff[] staffMembers, Holiday[] destinations){
    this.staffMembers = staffMembers;
    this.destinations = destinations;
  }

  public void displaySalaries(){
    System.out.println("---Employee: Salary(£)---");
    for(Staff employee: staffMembers){
      System.out.println(employee.getName() + ": £" + (float)employee.getSalary()/100);
    }
  }  public void displayHolidays(){

  }

  public void totalSalaryCost(){
    int total = 0;
    for(Staff employee: staffMembers){
      total += employee.getSalary();
    }
    System.out.println("---Total Salary Cost: £" + (float)total/100);
  }

  public void increaseSalaries(float percentage){
    for(Staff employee: staffMembers){
      employee.increaseSalary(percentage);
    }
  }

  public void guideSpecialisation(){
    System.out.println("---Holiday Guide: Specilisation---");
    for(Staff employee: staffMembers){
      if(employee instanceof Guide){
        Guide guide = (Guide)employee;
        System.out.println(guide.getName() + ":  " + guide.getActivity());
      }
    }
  }

  public void adventureDetails(){
    System.out.println("---Holiday ID : Guide : Location : Difficulty level---");
    for(Holiday holiday: destinations){
      if(holiday instanceof Adventure){
        Adventure aHoliday = (Adventure)holiday;
        System.out.println(aHoliday.getID() + " : " + aHoliday.getGuide().getName() +  " : " + aHoliday.getLocation() + " : " + aHoliday.getDifficulty());
      }
    }
  }

  public void displayHolidays(LocalDate period){

  }

  public void mostExpensiveH(){
    System.out.println("---Most Expensive Holiday Location: Price Location---");
    Holiday max = destinations[0];
    for(Holiday holiday: destinations){
      if(max.getCost() < holiday.getCost()){
        max = holiday;
      }
    System.out.println(max.getLocation() + " £" +  (float)max.getCost()/100);
    }
  }

  public void cultureLectures(){
    System.out.println("---Holiday's With Lectures---");
    for(Holiday holiday: destinations){
      if(holiday instanceof Culture){
        Culture cHoliday = (Culture)holiday;
        if(cHoliday.isLecture()){
          System.out.print(cHoliday.getLocation() + " : £" + (float)cHoliday.getCost()/100
          + " : Aspects - ");
          String dAspects = "";
          for(String aspect: cHoliday.getAspects()){
            dAspects += aspect + ", ";
          }
          //to remove extra ", "
          dAspects = dAspects.substring(0, dAspects.length() - 3);
        }
      }
    }
  }
}
