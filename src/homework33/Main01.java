package homework33;

public class Main01 {
    public static void changeSign(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -arr[i];
            System.out.print(arr[i] + " ");
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length ; i++)  {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -4, 8, -3, -6};
            System.out.print("Исходный масив: " );
        print(arr);

        System.out.println();
        System.out.print("Измененный масив: ");
        changeSign(arr);

        }
    }

