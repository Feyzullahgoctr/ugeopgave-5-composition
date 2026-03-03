package Opgave1;

public class Lamp {

    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    public int getWatt() {
        return watt;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "watt=" + watt +
                ", isOn=" + isOn +
                '}';
    }
}
