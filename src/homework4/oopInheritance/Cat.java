package homework4.oopInheritance;

public class Cat extends Animal {
    static int instanceCount = 0;

    public Cat() {
        instanceCount++;
    }

    @Override
    public void run(double distance) {
        if (distance < 200) {
            System.out.println("cat run " + distance + " m.");
        } else {
            System.out.println("cat can't run this distance " + distance + " m.");
        }
    }

    @Override
    public void swim(double distance) {
        System.out.println("сat can't swim");
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
