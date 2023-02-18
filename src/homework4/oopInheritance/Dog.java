package homework4.oopInheritance;

public class Dog extends Animal {
    static int instanceCount = 0;

    public Dog() {
        instanceCount++;
    }

    @Override
    public void run(double distance) {
        if (distance < 500) {
            System.out.println("Dog run " + distance + " m.");
        } else {
            System.out.println("Dog can't run this distance " + distance + " m.");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance < 10) {
            System.out.println("Dog swim " + distance + " m.");
        } else {
            System.out.println("Dog can't swim this distance " + distance + " m.");
        }
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}

