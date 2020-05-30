package com.example.shixun13;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase(Contents.CIRCLE)){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase(Contents.RECTANGLE)){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase(Contents.SQUARE)){
            return new Square();
        }
        return null;
    }
}
