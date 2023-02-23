package homework5.oopPolymorphism.competition.obstacle;

import homework5.oopPolymorphism.competition.participant.Participant;

public abstract class Obstacle {
    private final double distance;

    public Obstacle(double distance) {
        this.distance = distance;
    }

    public abstract void overcome (Participant participant);

    public double getDistance() {
        return distance;
    }
}
