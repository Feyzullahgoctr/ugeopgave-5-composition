package Opgave2;

import java.util.Random;

public class Wolf extends Animal {

    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack(Animal animal) {
        Random random = new Random();
        int randomAttack = random.nextInt(30) + 1;
        int firstEnergi = animal.getEnergy();
        int endEnergi = firstEnergi - randomAttack;
        animal.setEnergy(endEnergi);

        System.out.println(getName() + " angriber " + animal.getName() + " for " + randomAttack + "! (" + animal.getName() + " har " + animal.getEnergy() + " energi tilbage) " + firstEnergi + " ==> " + endEnergi);

        return randomAttack;
    }

}
