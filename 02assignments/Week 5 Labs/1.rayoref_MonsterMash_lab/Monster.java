//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class Monster
{
  //build your own Monster class
  //with methods like isBigger and isSmaller
  //or use your Monster class from
  //lab18 lab set 1

  private int height;
  private int weight;
  private int age;

  public Monster() {
    height = 1;
    weight = 1;
    age = 1;
  }

  public Monster(int ht, int wt, int ae) {
    height = ht;
    weight = wt;
    age = ae;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int ht) {
    height = ht;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int wt) {
    weight = wt;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int ae) {
    age = ae;
  }

  private boolean isBigger(Monster other) {
    if (other.getWeight() > weight)
      return true;
    return false;
  }

  private boolean isSmaller(Monster other) {
    //call isBigger() use !
    if (!isBigger(other))
      return true;
    return false;
  }

  public String toString() {
    return "Height: " + height + " Weight: " + weight + " Age: " + age;
  }
}