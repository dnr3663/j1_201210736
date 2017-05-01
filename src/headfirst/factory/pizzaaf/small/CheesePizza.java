package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory ingredientFactory;
  
  public CheesePizza(PizzaIngredientFactory ingredientFactory){
    this.ingredientFactory = ingredientFactory;
  }
  void prepare(){
    System.out.println("Prepareing " + name);
    dough = ingredientFactory.createDough();
    cheese = ingredientFactory.createCheese();
  }
}
