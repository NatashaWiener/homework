package homework25.task02;


public class Pen {

  public static final int MAX_INK = 1000;
  public int inkAmount = MAX_INK;

  public void write(String str) {
    if (inkAmount >= str.length()) {
      inkAmount -= str.length();
      System.out.println(str.length());
    }
  }

  public void refill() {
    inkAmount = MAX_INK;
  }

  public void checkInk() {
    System.out.println("INK remaining: " + inkAmount);
  }

}
