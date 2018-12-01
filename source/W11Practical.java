import java.util.Random;
import java.time.LocalDate;

public class W11Practical {

  public static void main(String[] args){
    Staff[] staffList  = generateStaffMembers();
    Holiday[] holidays = generateHolidays(staffList);
    Company company = new Company(staffList, holidays);
    //Test1(company);
    //Test2(company, holidays);
    //Test3(company);
  }

  public static void Test1(Company company){
    //prints initial salaries and total salary cost
    company.displaySalaries();
    company.totalSalaryCost();
    //percentage increement of total salary
    company.increaseSalaries(1.5);
    //prints updated salaries and total salary cost
    company.displaySalaries();
    company.totalSalaryCost();
  }

  public static void Test2(Company company, Holiday[] holidays){
    System.out.print("First randomly generated Holiday: ");
    System.out.println(holidays[0].getDate().toString());
    company.displayHolidaysIn(holidays[0].getDate());
    company.mostExpensiveH();
  }

  public static void Test3(Company company){
    company.adventureDetails();
    System.out.println("-----------------------------------------");
    company.guideSpecialisation();
    System.out.println("-----------------------------------------");
    company.cultureLectures();
  }
  //Creates the list of Staff Members
  public static Staff[] generateStaffMembers(){
    final int SALARY = 10000;
    Staff[] staffList = new Staff[13];
    for(int i = 0; i < 10; i++){
      staffList[i] = new Guide("Guide " + i, SALARY, "Activity " + i);
    }
    for(int i = 10; i < 13; i++){
      String[] skills = {"Skill " + i, "Skill "+ 2*i};
      staffList[i] = new Admin("Admin " + i, SALARY, skills);
    }
    return staffList;
  }

  public static Holiday[] generateHolidays(Staff[] staff){
    //Boundary values of salary employees
    final int MAX_COST = 500000;
    final int MIN_COST = 5000;
    //Boundary values for Days of avaliable
    final int MAX_DAY = 28;
    final int MIN_DAY = 1;
    //Boundary values for Months of avaliable
    final int MAX_MONTH = 12;
    final int MIN_MONTH = 1;
    //Boundary values for Duration
    final int MAX_DURATION = 20;
    final int MIN_DURATION = 2;

    Holiday[] holidayList = new Holiday[30];
    //generating random costs
    Random rand = new Random();
    int rCost;
    //generating random dates
    int rDay;
    int rMonth;
    //Random holiday duration
    int rDuration;
    for(int i = 0; i < 10; i++){
      //For a New Adventure Object
      rCost = rand.nextInt(MAX_COST)+ MIN_COST;
      rDay = rand.nextInt(MAX_DAY) + MIN_DAY;
      rMonth = rand.nextInt(MAX_MONTH) + MIN_MONTH;
      rDuration = rand.nextInt(MAX_DURATION) + MIN_DURATION;
      holidayList[i] = new Adventure((Admin)staff[10], "Adventure Location " + i, rCost, LocalDate.of(2019, rMonth, rDay), rDuration, (Guide)staff[i], i);
      //For a New Culture Object
      rCost = rand.nextInt(MAX_COST)+ MIN_COST;
      rDay = rand.nextInt(MAX_DAY) + MIN_DAY;
      rMonth = rand.nextInt(MAX_MONTH) + MIN_MONTH;
      rDuration = rand.nextInt(MAX_DURATION) + MIN_DURATION;
      //used for generating random aspects
      String[] aspects = {"Aspect " + i, "Aspect " + 2 * i};
      holidayList[i + 10] = new Culture((Admin)staff[11], "Culture Location " + i, rCost, LocalDate.of(2019, rMonth, rDay), rDuration, i%2==0, aspects);
      //For a new Culture Object
      rCost = rand.nextInt(500000)+ 5000;
      rDay = rand.nextInt(28) + 1;
      rMonth = rand.nextInt(12) + 1;
      rDuration = rand.nextInt(20) + 2;
      holidayList[i + 20] = new Relaxation((Admin)staff[12], "Relaxation Location " + i,rCost ,LocalDate.of(2019, rMonth, rDay), rDuration, "amenities: " + i);
    }
    return holidayList;
  }
}
