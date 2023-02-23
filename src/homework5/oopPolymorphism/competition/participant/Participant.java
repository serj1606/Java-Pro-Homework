package homework5.oopPolymorphism.competition.participant;

import homework5.oopPolymorphism.competition.obstacle.Obstacle;

public class Participant {
    private final String name;
    private double maxJumpingHeight;
    private double maxRunningLength;
    private boolean isOvercameObstacles;

    public Participant(String name, double maxJumpingHeight, double maxRunningLength, boolean isOvercameObstacles) {
        this.name = name;
        this.maxJumpingHeight = maxJumpingHeight;
        this.maxRunningLength = maxRunningLength;
        this.isOvercameObstacles = isOvercameObstacles;
    }

    public String getName() {
        return name;
    }

    public void setOvercameObstacles(boolean overcameObstacles) {
        isOvercameObstacles = overcameObstacles;
    }

    public boolean isOvercameObstacles() {
        return isOvercameObstacles;
    }

    private void printRemainder() {
        System.out.println("Remainder --->  maxJumpingHeight " + maxJumpingHeight + " -- maxRunningLength " + maxRunningLength);
    }

    public void run(Obstacle obstacle) {
        if (obstacle.getDistance() <= maxRunningLength) {
            maxRunningLength -= obstacle.getDistance();
            System.out.println("Participant " + getName() + " cleared obstacle " + obstacle.getClass().getSimpleName() + " at distance " + obstacle.getDistance());
            printRemainder();
        } else {
            setOvercameObstacles(false);
            System.out.println("Participant  " + getName() + " not cleared obstacle " + obstacle.getClass().getSimpleName() + " at distance " + obstacle.getDistance() +
                    ". Cleared " + maxRunningLength);
            printRemainder();
        }
    }

    public void jump(Obstacle obstacle) {
        if (obstacle.getDistance() <= maxJumpingHeight) {
            maxJumpingHeight -= obstacle.getDistance();
            System.out.println("Participant " + getName() + " cleared obstacle " + obstacle.getClass().getSimpleName() + " at distance " + obstacle.getDistance());
            printRemainder();
        } else {
            setOvercameObstacles(false);
            System.out.println("Participant  " + getName() + " not cleared obstacle " + obstacle.getClass().getSimpleName() + " at distance " + obstacle.getDistance() +
                    ". Cleared " + maxJumpingHeight);
            printRemainder();
        }
    }
}

