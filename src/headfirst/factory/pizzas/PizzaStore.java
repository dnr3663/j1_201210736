package headfirst.factory.pizzas;

//import headfirst.factory.pizzas.Pizza; Pizza�� �ٸ�Ŭ�����ε� �����ִ� ����:

public class PizzaStore {
  SimplePizzaFactory factory = null;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory = factory;
  }
  
  public Pizza orderPizza(String type){
  Pizza pizza = null;
  pizza = factory.createPizza(type); //factory Ư¡�����ִ� ����
  pizza.preparte();
  pizza.bake();
  pizza.cut();
  pizza.box();
  return pizza;
  }
}
