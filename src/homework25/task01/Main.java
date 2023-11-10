package homework25.task01;

public class Main {

  public static void main(String[] args) {
    Human Fred = new Human();
    Fred.name = "Fred";
    Fred.age = 36;
    Human Anna = new Human();
    Anna.name = "Anna";
    Anna.age = 30;
    Human Stella = new Human();
    Stella.name = "Stella";
    Stella.age = 28;

    Fred.introduce();
    Anna.introduce();
    Stella.introduce();
  }


}
