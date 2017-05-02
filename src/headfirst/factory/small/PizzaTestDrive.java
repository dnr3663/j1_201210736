package headfirst.factory.pizzaaf.small;

public class PizzaTestDrive{
  public static void main(String[] args){
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza + "\n");
    pizza = nyStore.orderPizza("potato");
    System.out.println("Lee ordered a " + pizza + "\n");
   
    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza + "\n");
    pizza = chicagoStore.orderPizza("potato");
    System.out.println("Kim ordered a " + pizza + "\n");
     
  }
}
//각 NY와 Chicago 별 포테이토를 만들었습니다.
