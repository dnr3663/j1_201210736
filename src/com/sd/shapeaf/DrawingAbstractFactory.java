package com.sd.shapeaf;

public abstract class DrawingAbstractFactory{
  abstract Color getColor(String color);
  abstract Shape getShape(String shape);
}
