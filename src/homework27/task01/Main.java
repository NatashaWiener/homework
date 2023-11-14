package homework27.task01;

public class Main {

  public static void main(String[] args) {
    Human human = new Human("Alex", 28,178,"green");
    System.out.println("My name ist " + human.getName() + " im " + human.getAge() + " years old "
        + " growth " + human.getGrowth() + " eyes color: " + human.getEyeColor());

    human.setAge(66);


 System.out.println("My name ist " + human.getName() + " im " + human.getAge() + " years old "
     + " growth " + human.getGrowth() + " eyes color: " + human.getEyeColor());

}
}