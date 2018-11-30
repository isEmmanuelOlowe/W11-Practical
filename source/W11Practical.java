import java.util.Random;
import java.time.LocalDate;

public class W11Practical {

  public static void main(String[] args){
    Staff[] staffList  = generateStaffMembers();
    Holiday[] holidays = generateHolidays(staffList);
    Company company = new Company(staffList, holidays);
    System.out.println(holidays[0].getDate().toString());
    company.displayHolidaysIn(holidays[0].getDate());
  }

  public static Staff[] generateStaffMembers(){
    Staff[] staffList = new Staff[13];
    for(int i = 0; i < 10; i++){
      staffList[i] = new Guide("Guide " + i, 10000, "Activity " + i);
    }
    for(int i = 10; i < 13; i++){
      String[] skills = {"Skill " + i, "Skill "+ 2*i};
      staffList[i] = new Admin("Admin " + i, 10000, skills);
    }
    return staffList;
  }

  public static Holiday[] generateHolidays(Staff[] staff){
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
      rCost = rand.nextInt(500000)+ 5000;
      rDay = rand.nextInt(28) + 1;
      rMonth = rand.nextInt(12) + 1;
      rDuration = rand.nextInt(20) + 2;
      holidayList[i] = new Adventure((Admin)staff[10], "Adventure Location " + i, rCost, LocalDate.of(2019, rMonth, rDay), rDuration, (Guide)staff[i], i);
      rCost = rand.nextInt(500000)+ 5000;
      rDay = rand.nextInt(28) + 1;
      rMonth = rand.nextInt(12) + 1;
      rDuration = rand.nextInt(20) + 2;
      String[] aspects = {"Aspect " + i, "Aspect " + 2 * i};
      holidayList[i + 10] = new Culture((Admin)staff[11], "Culture Location " + i, rCost, LocalDate.of(2019, rMonth, rDay), rDuration, i%2==0, aspects);
      rCost = rand.nextInt(500000)+ 5000;
      rDay = rand.nextInt(28) + 1;
      rMonth = rand.nextInt(12) + 1;
      rDuration = rand.nextInt(20) + 2;
      holidayList[i + 20] = new Relaxation((Admin)staff[12], "Relaxation Location " + i,rCost ,LocalDate.of(2019, rMonth, rDay), rDuration, "amenities: " + i);
    }
    return holidayList;
  }
}
