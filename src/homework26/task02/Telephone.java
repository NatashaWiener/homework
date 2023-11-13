package homework26.task02;

public class Telephone {

  String model;
 int yearOfRelease;
  String color;
 int memory;
  int weight;
  double displaySize;


  public Telephone(String model, int yearOfRelease, String color, int memory,
      int weight, double displaySize) {
    this.model = model;
  this.yearOfRelease = yearOfRelease;
    this.color = color;
    this.memory = memory;
    this.weight = weight;
    this.displaySize = displaySize;
  }
  public Telephone() {
    this("Galaxy s22", 2022, "Blue", 256, 167, 6.1 );
  }

}
