public class Company {

  private Staff[] staffMembers;
  private Holiday[] destinations;
  public Company(Staff[] staffMembers, Holiday destinations){
    this.staffMembers = staffMembers;
    this.destinations = destinations;
  }

  public void displaySalaries(){
    System.out.println("---Employee: Salary(£)---");
    for(Staff employee: staffMembers){
      System.out.println(employee.getName() + ": £" + (float)employee.getSalary()/100);
    }
  }

  public void totalSalaryCost(){
    int total = 0;
    for(Staff employee: staffMembers){
      total += employee.getSalary;
    }
    System.out.println("---Total Salary Cost: £" + (float)employee.getSalary()/100);
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
        System.out.println(employee.getName() + ":  " + employee.getActivity());
      }
    }
  }

  public void adventureDetails(){
    System.out.println("---Holiday ID : Location : Difficulty level---");
    for(Holiday holiday: destinations){
      if(holiday instanceof Adventure){
        System.out.println(employee.getID() " : " + employee.getLocation() + " : " + employee.getDifficulty());
      }
    }
  }

  public void displayHolidays(){

  }

  public void mostExpensiveH(){
    System.out.println("---Most Expensive Holiday Location: Price Location---");
    Holiday max = staffMembers[0];
    for(Holiday holiday: destinations){
      if(max.getCost() < holiday.getCost()){
        max = holiday;
      }
    System.out.println(max.getLocation() + " £" +  max.getCost/100);
    }
  }

  public cultureLectures(){
    System.out.println("---Holiday's With Lectures---")
    for(Holiday holiday: destinations){
      if(holiday instanceof Culture){
        if(holiday.isLecture()){
          System.out.print(holiday.getLocation()" : " + holiday.getCost() + " : "
          + " : Aspects - ");
          String dAspects;
          for(String aspect: holiday.getAspects()){
            dAspects += aspect + ", ");
          }
          //to remove extra ", "
          dAspects = dAspects.substring(0, dAspects.length - 3);
          System.out.println(dAspects);
        }
      }
    }
  }
}
