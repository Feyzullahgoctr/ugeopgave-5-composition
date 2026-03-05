package Opgave2;

// Animal-objekt skal ikke oprettes i Main Metodu
// Subklasser har forskellig adfærd
public abstract class Animal {

    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        if (energy < 0) {
            energy = 0;
        }
        this.energy = energy;
    }

    public boolean isActive() {
        if (energy > 0) {
            return true;
        }
        return false;
    }

    public int attack(Animal animal) {
        return 0;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                '}';
    }







}
