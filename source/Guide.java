public class Guide extends Staff {

  private String activity;
  public Guide(String name, int salary, String activity){
    super(name, salary);
    this.activity = activity;
  }

  public String getActivity(){
    return this.activity;
  }
}
