package homework5.oopPolymorphism.figure;

public class AreasFigures {
     public void getTotalArea() { //обчислюємо загальну площу фігур
        double result = 0;

         Figure[] figures = {new Circle(5), new Square(4), new Triangle(2,3,4)};

        for (Figure figure : figures) {
            result += figure.getArea();
        }
        System.out.println("total area of figures: " + result);
    }

}
