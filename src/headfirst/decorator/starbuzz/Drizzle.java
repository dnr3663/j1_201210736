package headfirst.decorator.starbuzz;

public class Drizzle extends CondimentDecorator{
  Beverage beverage;
  public Drizzle(Beverage b){
    this.beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription()+" adding Drizzle";
  }
  public double cost(){
    return .42 + beverage.cost();
  }
}
