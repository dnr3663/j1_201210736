package com.sd.shapeaf;

public class DrawingTest{
  public static void main(String[] args){
    DrawingAbstractFactory factory= new ShapeFactory();
    Shape s=factory.getShape("triangle");
    s.show();
    System.out.println("---NULL color");
    
    Color c = factory.getColor("green");
    factory = new ColorFactory();
    c = factory.getColor("green");
    c.fill();
    System.out.println("---NULL shape");
    s = factory.getShape("triangle");
    s.show();
  }
}
