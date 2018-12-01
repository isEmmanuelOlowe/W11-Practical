public class Guide extends Staff {

  private String activity;

  public Guide(String name, int salary, String activity){
    super(name, salary);
    this.activity = activity;
  }

  public String getActivity(){
    return this.activity;
  }

  //prints all data of the object
  public void printAll(){
    super.printAll();
    //adds new line
    System.out.println("|" + this.activity + "|");
  }
}
