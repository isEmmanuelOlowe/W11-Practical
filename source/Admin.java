public class Admin extends Staff {

  private String[] skills;
  public Admin(String name, int salary, String... skills){
    super(name, salary);
    this.skills = skills;
  }
}
