package homework32;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите число от 1 до 10: ");
            num = scanner.nextInt();

        } while (num <= 0 || num >= 11);
        System.out.println("Вы ввели " + num + ". Спасибо!");


    }
}
