package homework37;

public class RemoteControl {
    private int frequency;

    public RemoteControl(int frequency) {
        this.frequency = frequency;
    }
    public void  switchChannelForward(TV tv) {
        if (frequency == tv.getFrequency()) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        }
    }
    public void  switchChannelBackward(TV tv) {
        if (frequency == tv.getFrequency()) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        }
    }
    public void  switchChannel(TV tv, int channel) {
        if (frequency == tv.getFrequency() && channel > 0) {
            tv.setCurrentChannel(channel);
        }
    }
}
