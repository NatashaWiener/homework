package homework33;

import java.util.Scanner;

public class Main01 {
    public static void changeSign(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -arr[i];

        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, -4, 8, -3, -6};
        changeSign(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }



        }

        }


