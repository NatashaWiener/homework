package homework35;

public class LightBulb {
    private int barCode;
    private String manufacturer;
    private int brightness;
    private boolean rgb;
    private double price;

    public LightBulb(int barCode, String manufacturer, int brightness, boolean rgb, double price) {
        this.barCode = barCode;
        this.manufacturer = manufacturer;
        this.brightness = brightness;
        this.rgb = rgb;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getBrightness() {
        return brightness;
    }


    public boolean getRgb() {
        return rgb;
    }
}

