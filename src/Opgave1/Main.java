package Opgave1;

public class Main {

    public static void main() {

        Building building = new Building("Kontor Bygningen");

        Room local = new Room("Mødelokale");
        Room kitchen = new Room("Køkken");

        local.addLamp(new Lamp(60));
        local.addLamp(new Lamp(60));
        local.addLamp(new Lamp(100));
        local.addWindow(new Window(120,90));
        local.addWindow(new Window(120,90));

        kitchen.addLamp(new Lamp(40));
        kitchen.addLamp(new Lamp(40));
        kitchen.addWindow(new Window(60, 60));

        building.addRoom(local);
        building.addRoom(kitchen);
        building.printBuilding();


    }

}
