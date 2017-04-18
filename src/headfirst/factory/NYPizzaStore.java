package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String item){
  Pizza pizza = null;
    if (item.equals("Cheese")){
      pizza = new NYStyleCheesePizza();
  
    } else if (item.equals("pepperoni")){
      pizza = new PepperoniPizza();
    }
    else if (item.equals("SMU")){
      pizza = new SMUStylePizza();
    }
  return pizza;
  }
}


 