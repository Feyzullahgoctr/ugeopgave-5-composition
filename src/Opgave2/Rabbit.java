package Opgave2;

public class Rabbit extends Animal{

    public Rabbit(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack(Animal animal) {
        int damage = 12;
        int firstEnergi = animal.getEnergy();
        int endEnergi = firstEnergi - damage;
        animal.setEnergy(endEnergi);

        System.out.println(getName() + " angriber " + animal.getName() + " for " + damage + "! (" + animal.getName() + " har " + animal.getEnergy() + " energi tilbage) " + firstEnergi + " ==> " + endEnergi);
        return damage;
    }
}
