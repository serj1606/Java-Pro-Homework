package homework5.oopPolymorphism.competition.obstacle;

import homework5.oopPolymorphism.competition.participant.Participant;

public class Wall extends Obstacle {

    public Wall(double distance) {
        super(distance);
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump(this);
    }

}
