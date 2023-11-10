package homework25.pen;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
    System.out.println("Введите текст: ");
  String user = scanner.nextLine();
  Pen pen = new Pen();
    pen.write(user);
    System.out.println(pen.getInkLevel());
    pen.refill();
    pen.checkInk();





}
}
