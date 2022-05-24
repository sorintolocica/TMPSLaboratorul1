package FactoryMethod;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CERC")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("DREPTUNGHI")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("PATRAT")){
            return new Square();
        }

        return null;
    }
}
