package com.sd.shapeaf;

public class ShapeFactory extends DrawingAbstractFactory {
  public Color getColor(String color){return new NullColor();}
  public Shape getShape(String shape){
    Shape s = null;
    String str = shape.toLowerCase();
    System.out.println("getShape() " +str);
    if(str.equals("rectangle"))
      s = new Rectangle();
    else if(str.equals("square"))
      s = new Square();
    else if(str.equals("triangle"))
      s = new Triangle();
    return s;
  }
}
