package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CERC");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("DREPTUNGHI");

        shape2.draw();

        Shape shape3 = shapeFactory.getShape("PATRAT");

        shape3.draw();
    }
}