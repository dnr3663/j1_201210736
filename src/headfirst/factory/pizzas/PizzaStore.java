package headfirst.factory.pizzas;

//import headfirst.factory.pizzas.Pizza; Pizza가 다른클래스인데 안해주는 이유:

public class PizzaStore {
  SimplePizzaFactory factory = null;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory = factory;
  }
  
  public Pizza orderPizza(String type){
  Pizza pizza = null;
  pizza = factory.createPizza(type); //factory 특징보여주는 라인
  pizza.preparte();
  pizza.bake();
  pizza.cut();
  pizza.box();
  return pizza;
  }
}
