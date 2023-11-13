package homework26.task01;

public class Main {
  public static void printHumanDescription(Human description) {
    System.out.println("Name: " + description.name);
    System.out.println("Age: " + description.age);
    System.out.println("Growth: " + description.growth + " cm");
    System.out.println("Eye color: " + description.eyeColor);
  }

  public static void main(String[] args) {
    Human human = new Human("Alex", 31, 170, "blue");
    printHumanDescription(human);

  }

}
