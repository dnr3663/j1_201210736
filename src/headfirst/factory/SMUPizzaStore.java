package headfirst.factory.pizzafm;

public class SMUPizzaStore extends PizzaStore{
  Pizza createPizza(String item){
  Pizza pizza = null;
    if (item.equals("SMU")){
      pizza = new SMUStylePizza();
  
    }
  return pizza;
  }
}