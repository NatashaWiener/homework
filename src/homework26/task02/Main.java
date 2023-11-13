package homework26.task02;

public class Main {
public static void telephoneInfo( Telephone telephone) {
  System.out.println("Model: " + telephone.model);
  System.out.println("Date of release: " + telephone.yearOfRelease);
  System.out.println("Color: " + telephone.color);
  System.out.println("Memory: " + telephone.memory);
  System.out.println("Weight: " + telephone.weight + " gram");
  System.out.println("Display size: " + telephone.displaySize + " inch");
}
  public static void main(String[] args) {
  Telephone telephone = new Telephone("iphone 15", 2023, "black",
      512, 171, 6.1 );
    telephoneInfo(telephone);

    Telephone telephone1 = new Telephone();
    telephoneInfo(telephone1);
  }

  }

