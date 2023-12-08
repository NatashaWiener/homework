package homework37;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV(100,1);
        RemoteControl remote = new RemoteControl(100);
        remote.switchChannelForward(tv);
        System.out.println("Текущий канал: " + tv.getCurrentChannel());
        remote.switchChannelBackward(tv);
        System.out.println("Текущий канал: " + tv.getCurrentChannel());
        remote.switchChannel(tv, 5);
        System.out.println("Текущий канал: " + tv.getCurrentChannel());
    }
}
//Это отношение осоциация.