public class Passenger{

  private String firstName;
  private String lastName;
  private int age;

  public Passenger(String lastName, String firstName, int age){
    this.lastName = lastName;
    this.firstName = firstName;
    this.age = age;
  }

  public void setFirstName(String name){
    this.firstName = name;
  }
  public void setLastName(String name){
    this.lastName = name;
  }
  public void setAge(int age){
    this.age = age;
  }

  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public int getAge(){
    return age;
  }
}
