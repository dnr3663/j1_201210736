package headfirst.decorator.starbuzz;

public class Vanilla extends CondimentDecorator{
  Beverage beverage;
  public Vanilla(Beverage b){
    this.beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription()+" adding VanillaSyrup";
  }
  public double cost(){
    return .30 + beverage.cost();
  }
}
