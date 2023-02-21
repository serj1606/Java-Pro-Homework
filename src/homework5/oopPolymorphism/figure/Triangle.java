package homework5.oopPolymorphism.figure;

public class Triangle implements Figure {
    private final double a; //сторона трикутника
    private final double b; //сторона трикутника
    private final double c; //сторона трикутника

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2; //обчислюємо півпериметр - p
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); //обчислюємо площу трикутника по формулі Герона
    }
}
