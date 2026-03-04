package Opgave2;

public class Contest {

    private int tours;
    private Animal animal1;
    private Animal animal2;

    public Contest(Animal animal1, Animal animal2,int tours) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.tours = tours;
    }

    public void playRound() {

        for (int i = 1; i <= tours; i++) {
            System.out.println("\u001B[40m\u001B[4m" +" ---------- Runde " + i + " ---------- " + "\u001B[0m");
            if (animal1.isActive() && animal2.isActive()) {
                animal1.attack(animal2);
                animal2.attack(animal1);
            } else {
                return;
            }
        }

        Animal winnerAnimal = getWinner();

        if (winnerAnimal == null) {
            System.out.println("\u001B[40m\u001B[31m" + "\u2713"  + " Der er ikke nogen, der vinder " + "\u001B[0m");
        } else {
            System.out.println( "\u001B[40m\u001B[34m" + "\u2713"  + " Winner Animal :" + winnerAnimal.getName() + " " + "\u001B[0m");

        }

    }

    public Animal getWinner() {
        if (animal1.isActive() && animal2.isActive()) {
            return null;
        }

        if (animal1.getEnergy() > animal2.getEnergy()) {
            return animal1;
        }

        return animal2;

    }

}
