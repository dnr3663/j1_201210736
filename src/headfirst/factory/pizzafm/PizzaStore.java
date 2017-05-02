package headfirst.factory.pizzafm;

public abstract class PizzaStore {
  abstract Pizza createPizza(String item);
  public Pizza orderPizza(String type){
 
  //pizza = factory.createPizza(type); //factory ?????¢¬????¢¥? ????
  Pizza pizza = createPizza(type);
  pizza.preparte();
  pizza.bake();
  pizza.cut();
  pizza.box();
  return pizza;  
  }
}