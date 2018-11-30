import java.lang.Math;
public class Staff {
  //unique identifier for staff member
  private static int noStaff = 0;

  private int staffID;
  private String name;
  private int salary;

  public Staff(String name, int salary){
    this.staffID = noStaff;
    this.name = name;
    this.salary = salary;

    noStaff++;
  }

  public int getID(){
    return this.staffID;
  }

  public String getName(){
    return this.name;
  }

  public int getSalary(){
    return this.salary;
  }

  public void increaseSalary(float percentage){
    this.salary = (int)Math.round(this.salary * percentage);
  }

}
