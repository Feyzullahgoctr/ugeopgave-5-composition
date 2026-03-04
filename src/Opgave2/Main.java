package Opgave2;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Animal simba = new Lion("Simba", 90);
        Animal rabbit = new Rabbit("Rabbit", 95);
        Animal wolf = new Wolf("Wolf", 80);
        Animal wolf2 = new Wolf("Wolf2", 75);

        animals.add(simba);
        animals.add(rabbit);
        animals.add(wolf);
        animals.add(wolf2);

        // Antal runder
        int tours = 4;

        Contest contest = new Contest(animals.get(0), animals.get(2), tours);
        contest.playRound();
        Contest contest1 = new Contest(animals.get(1), animals.get(3), tours);
        contest1.playRound();


    }

}
