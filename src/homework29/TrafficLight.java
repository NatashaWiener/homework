package homework29;

public class TrafficLight {

    private ColorTrafficLight currentColor;

    public ColorTrafficLight getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(ColorTrafficLight currentColor) {
        this.currentColor = currentColor;
    }

    public boolean canCrossTheRoad() {
        return currentColor == ColorTrafficLight.GREEN;
    }
}
