package homework32;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер масива: ");
        int size = scanner.nextInt();

        System.out.println("Введите масив целых чисел: ");
        int[] arr = new int[scanner.nextInt()];
        for (int i = 1; i < size; i++) {
            arr[i] = scanner.nextInt();
        }




           System.out.println(" Масив отсортирован!");


           System.out.println(" Масив не отсортирован!");
        }



    }


