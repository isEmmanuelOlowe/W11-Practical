public class Company {

  private ArrayList<Staff> staffMembers;
  private ArrayList<Holiday> destinations;
  public Company(Staff[] staffMembers, Holiday destinations){
    this.staffMembers = new ArrayList<Staff>(Arrays.asList(staffMembers));
    this.destinations = new ArrayList<Staff>(Arrays.asList(destinations));
  }


}
