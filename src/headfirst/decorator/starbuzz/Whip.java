package headfirst.decorator.starbuzz;

public class Whip extends CondimentDecorator{
  Beverage beverage;
  public Whip(Beverage b){
    this.beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription()+" adding whip";
  }
  public double cost(){
    return .10 + beverage.cost();
  }
}
