package homework35;
/* Это класс лампочки, его можно использовать в продаже, для внесение данных в компьютер продаж.
* создать класс для лампочки, описать свойства:
* цена,rgb,штрих-код,яркость,производитель,яркость.
* Создать конструктор для всех полей.
* создать акссесоры.
*  */
public class Main {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb(987654,"Light",30,true, 12.99);
        System.out.println("BarCode: " + bulb.getBarCode());
        System.out.println("Manufacture: " + bulb.getManufacturer());
        System.out.println("Brightness: " + bulb.getBrightness());
        System.out.println("RGB: " + bulb.getRgb());
        System.out.println("Price: " + bulb.getPrice());

    }
}
