package homework47.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // делаем массивы с данными
       Pair<String, Double>[] productsAndPrice = new Pair[]{
               new Pair<>("Яблоко", 2.0),
               new Pair<>("Картошка", 1.5),
               new Pair<>("Огурец", 2.5),
               new Pair<>("Помидор", 3.0),
               new Pair<>("Лук", 1.0),
               new Pair<>("Виноград", 3.5)
       };


        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        Double price = null;
        // ищем по размеру массива цен, но сравниваем названия продуктов
        // Очевидно, работает это только если массивы одинакового размера
        // Делать так можно только если массивы тесно связаны, как в нашем случае, это наименования и цены
        for (int i = 0; i < productsAndPrice.length; i++) {
            Pair<String, Double> pair = productsAndPrice[i];
            if (userChoice.equals(pair.getFirst())) {
                price = pair.getSecond();
                break;
            }
        }
        // индекс найденного продукта используем для того чтобы
        if (price != null) {
            System.out.println(price);
        } else {
            System.out.println("Товара " + userChoice + " нет в магазине");
        }

    }
}
