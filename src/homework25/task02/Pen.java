package homework25.pen;

public class Pen {
  int inkLevel = 1000;
  public void write(String pen) {
    int written = pen.length();
    if (inkLevel >= written) {
      inkLevel -= written;
    }
    }


  public int getInkLevel() {
    return inkLevel;
  }

public void refill() {
    inkLevel = 1000;
}
public void checkInk() {
  System.out.println(inkLevel);
}

}
