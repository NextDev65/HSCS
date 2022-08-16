//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.util.Arrays;

public class Monsters
{
  private Monster[] myMonsters;

  public Monsters(int size) {
    myMonsters = new Monster[size];
  }

  public void add(int spot, Monster m) {
    //put m in the Monster array at [spot]
    myMonsters[spot] = m;
  }

  public int getLargest() {
    int heaviest = myMonsters[0].getWeight();

    for (int i = 0; i < myMonsters.length; i++) {
      if (myMonsters[i].getWeight() > heaviest) {
        heaviest = myMonsters[i].getWeight();
      }
    }
    return heaviest;
  }

  public int getSmallest() {
    int lightest = myMonsters[0].getWeight();

    for (int i = 0; i < myMonsters.length; i++) {
      if (myMonsters[i].getWeight() < lightest) {
        lightest = myMonsters[i].getWeight();
      }
    }
    return lightest;
  }

  public String toString() {
    return Arrays.toString(myMonsters);
  }
}