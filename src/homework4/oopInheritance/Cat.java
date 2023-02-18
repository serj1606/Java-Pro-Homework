package homework4.oopInheritance;

public class Cat extends Animal {
    static int instanceCount = 0;

    public Cat() {
        instanceCount++;
    }

    @Override
    public void run(double distance) {
        if (distance < 200) {
            System.out.println("Cat run " + distance + " m.");
        } else {
            System.out.println("Cat can't run this distance " + distance + " m.");
        }
    }

    @Override
    public void swim(double distance) {
        System.out.println("Cat can't swim");
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
