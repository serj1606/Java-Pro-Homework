package homework5.oopPolymorphism.figure;

public class Circle implements Figure{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
