package homework5.oopPolymorphism.competition.obstacle;

import homework5.oopPolymorphism.competition.participant.Participant;

public class Treadmill extends Obstacle {

    public Treadmill(double distance) {
        super(distance);
    }

    @Override
    public void overcome(Participant participant) {
        participant.run(this);
    }
}
