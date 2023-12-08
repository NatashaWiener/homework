package homework37;

public class TV {
    private int frequency;
    private int currentChannel;

    public TV(int frequency, int currentChannel) {
        this.frequency = frequency;
        this.currentChannel = currentChannel;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int channel) {
       if (channel > 0) {
           currentChannel = channel;
       }
    }
}
