package homework31;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько костей выкидывать? ");
        int numberOfDice = scanner.nextInt();
        if (numberOfDice == 1 || numberOfDice == 2) {
            int i = 1;
            while (i <= numberOfDice) {
                int value = random.nextInt(6) + 1;
                System.out.println("Кость " + i + ": " + value);
                i++;
            }
        } else {
            System.out.println("У меня нет такого количества костей. ");


        }
    }
}
