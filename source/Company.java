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
  }

  public void totalSalaryCost(){
    int total = 0;
    for(Staff employee: staffMembers){
      total += employee.getSalary();
    }
    System.out.println("---Total Salary Cost: £" + (float)total/100);
  }

  public void increaseSalaries(double percentage){
    for(int i = 0; i < this.staffMembers.length; i++){
      staffMembers[i].increaseSalary(percentage);
    }
  }

  public void guideSpecialisation(){
    System.out.println("---Holiday Guide: Specilisation---");
    for(Staff employee: staffMembers){
      if(employee instanceof Guide){
        employee.printAll();
      }
    }
  }

  //prints all the details of adventure holidays
  public void adventureDetails(){
    for(Holiday holiday: destinations){
      if(holiday instanceof Adventure){
        holiday.printAll();
      }
    }
  }

  public void displayHolidaysIn(LocalDate period){
      System.out.println("Holidays that are over " + period.toString());
      for(int i = 0; i < this.destinations.length; i++){
        if(destinations[i].inRange(period)){
          destinations[i].printAll();
        }
      }
  }

  //details of the Holiday with highest cost
  public void mostExpensiveH(){
    System.out.println("---------MOST EXPENSIVE HOLIDAY!!!---------");
    Holiday max = destinations[0];
    for(Holiday holiday: destinations){
      if(max.getCost() < holiday.getCost()){
        max = holiday;
      }
    //prints all the details of the holiday with the highest cost
    }
    max.printAll();
  }

  public void cultureLectures(){
    System.out.println("---Holiday's With Lectures---");
    for(Holiday holiday: destinations){
      if(holiday instanceof Culture){
        Culture cHoliday = (Culture)holiday;
        if(cHoliday.isLecture()){
          cHoliday.printAll();
        }
      }
    }
  }
}
