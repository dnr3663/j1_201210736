package headfirst.factory.pizzas;

public class SimplePizzaFactory{
  public Pizza createPizza(String type){
    Pizza pizza = new CheesePizza();
    if (type.equals("Cheese")){
      pizza = new CheesePizza();
    } else if(type.equals("pepperoni")){
      pizza = new PepperoniPizza();
    }else if (type.equals("potato")) {
      pizza = new PotatoPizza();  } 
    return pizza;
  }
}
