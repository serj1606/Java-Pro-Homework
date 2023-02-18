package homework4.oopInheritance;

public class Main {
    public static void main(String[] args) {
        new Cat().run(10);
        new Cat().run(1000);
        new Cat().swim(7);

        new Dog().run(50);
        new Dog().run(2000);
        new Dog().swim(8);
        new Dog().swim(500);

        System.out.println("counting created cats - " + Cat.getInstanceCount());
        System.out.println("counting created dogs - " + Dog.getInstanceCount());
        System.out.println("counting created animals (cats and dogs)  - " + Animal.getInstanceCount());
    }

}
