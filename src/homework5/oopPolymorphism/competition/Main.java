package homework5.oopPolymorphism.competition;

import homework5.oopPolymorphism.competition.obstacle.Obstacle;
import homework5.oopPolymorphism.competition.obstacle.Treadmill;
import homework5.oopPolymorphism.competition.obstacle.Wall;
import homework5.oopPolymorphism.competition.participant.Cat;
import homework5.oopPolymorphism.competition.participant.Human;
import homework5.oopPolymorphism.competition.participant.Participant;
import homework5.oopPolymorphism.competition.participant.Robot;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Treadmill(2),
                new Treadmill(3),
                new Treadmill(10),
                new Wall(15),
                new Wall(10),
                new Wall(20),
        };

        Participant[] participants = {
                new Human("Alan", 20, 20, true),
                new Cat("Simba", 5, 5, true),
                new Robot("Bot", 35, 35, true)
        };

        Competition competition = new Competition(participants, obstacles);
        competition.start();

    }
}
