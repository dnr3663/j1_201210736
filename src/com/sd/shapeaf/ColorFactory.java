package com.sd.shapeaf;

public class ColorFactory extends DrawingAbstractFactory {
  public Shape getShape(String shape){return new NullShape();}
  public Color getColor(String color){
    Color s = null;
    String str = color.toLowerCase();
    System.out.println("getColor() " +str);
    if(str.equals("red"))
      s = new Red();
    else if(str.equals("green"))
      s = new Green();
    else if(str.equals("blue"))
      s = new Blue();
    return s;
  }
}
