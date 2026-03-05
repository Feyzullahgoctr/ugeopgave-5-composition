package Opgave1;

import java.util.ArrayList;

public class Building {

    private String name;
    private ArrayList<Room> rooms;


    public Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        // Title
        String line = "\u2550".repeat(name.length() + 4);
        System.out.println("\u001B[36m\u001B[1m" +
                "\u2554" + line + "\u2557\n" +
                "\u2551  " + name + "  \u2551\n" +
                "\u255A" + line + "\u255D" +
                "\u001B[0m");
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Vi bruger denne metod i building class
    // Fordi Building har ArrayList<Room> og detaljer
    // Det er meget nemt at gøre det her.
    // Det er nemmere at læse og vedligeholde.
    // Vi forsøger at skrive forkortet i main method
    public int getTotalLampCount() {
        int totalLampCount = 0;
        for (Room room : rooms) {
            totalLampCount += room.getLampCount();
        }
        return totalLampCount;
    }
    public int getTotalWatt() {
        int totalWatt = 0;
        for (Room room : rooms) {
            totalWatt += room.getTotalWatt();
        }
        return totalWatt;
    }

    public void printBuilding() {
        for (Room room : rooms) {
            room.printRoom();
            System.out.println();
        }
        System.out.println("Total: " + getTotalLampCount() + " lamper, " + getTotalWatt() + "W");
        System.out.println("==============================");
    }

}
