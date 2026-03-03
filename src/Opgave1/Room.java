package Opgave1;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;
    private int lampCount = 0;
    private int windowCount = 0;


    public Room(String name) {
        this.name = name;
        lamps = new ArrayList<>();
        windows = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Lamp> getLamps() {
        return lamps;
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }

    public int getLampCount() {
        return lampCount;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
        lampCount++;
    }

    public void addWindow(Window window) {
        windows.add(window);
        windowCount++;
    }

    public int getTotalWatt() {
        int totalWatt = 0;
        for (Lamp lamp : lamps) {
            totalWatt += lamp.getWatt();
        }
        return totalWatt;
    }

    public int getTotalWindowArea() {
        int totalWindowArea = 0;
        for (Window window : windows) {
            totalWindowArea += window.getAreaCm2();
        }
        return totalWindowArea;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", lamps=" + lamps +
                ", windows=" + windows +
                ", lampCount=" + lampCount +
                ", windowCount=" + windowCount +
                '}';
    }

    public void printRoom() {
        System.out.println(name + " (" + lampCount + " lamper," + windowCount + " vinduer)");

        System.out.print("  Lamper: ");
        for (Lamp lamp : lamps) {
            System.out.print(lamp.getWatt() + "W, ");
        }
        System.out.print("(total: " + getTotalWatt() + "W)\n");

        System.out.print("  Vinduer: ");
        for (Window window : windows) {
            System.out.print(window + ", ");
        }
        System.out.println();
    }



}
