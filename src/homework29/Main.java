package homework29;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.setCurrentColor(ColorTrafficLight.RED);
        System.out.println("Current color " + trafficLight.getCurrentColor());
        System.out.println("Is it okay to cross the road? " + trafficLight.canCrossTheRoad());

        trafficLight.setCurrentColor(ColorTrafficLight.GREEN);
        System.out.println("Current color " + trafficLight.getCurrentColor());
        System.out.println("Is it okay to cross the road? " + trafficLight.canCrossTheRoad());

        trafficLight.setCurrentColor(ColorTrafficLight.YELLOW);
        System.out.println("Current color " + trafficLight.getCurrentColor());
        System.out.println("Is it okay to cross the road? " + trafficLight.canCrossTheRoad());
    }

}
