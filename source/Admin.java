public class Admin extends Staff {

  //assumed that there can be variable amount of skills
  private String[] skills;
  
  public Admin(String name, int salary, String[] skills){
    super(name, salary);
    this.skills = skills;
  }

  public String[] getSkills(){
    return this.skills;
  }

  public void printAll(){
    super.printAll();
    //string stores all the Skills
    //formats the strings by seperating they by comma
    String sSkills = "";
    for(int i = 0; i < this.skills.length; i++){
      sSkills += this.skills[i] + ", ";
    }
    sSkills = sSkills.substring(0, sSkills.length() - 2);
    System.out.println("|" + sSkills + "|");
  }
}
