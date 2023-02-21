package homework5.oopPolymorphism.figure;

public class Square implements Figure {
    private final double sideOfSquare;

    public Square(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public double getArea() {
        return sideOfSquare * sideOfSquare;
    }

}
