package homework27.task01;

public class Human {

  private String name;
 private int age;
  private int growth;
  private String eyeColor;

  public Human(String name, int age, int growth, String eyeColor) {
    this.name = name;
    this.age = age;
    this.growth = growth;
    this.eyeColor = eyeColor;
  }

  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }

  public int getGrowth() {
    return growth;
  }

  public String getEyeColor() {
    return eyeColor;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if (age > 60) {
      System.out.println("Retiree");
    }
      this.age = age;
    }

  public void setGrowth(int growth) {
    this.growth = growth;
  }

  public void setEyeColor(String eyeColor) {
    if (!eyeColor.equals("blue")) {
      System.out.println(eyeColor);
    }
    this.eyeColor = eyeColor;
  }
}
