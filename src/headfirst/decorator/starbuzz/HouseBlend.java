package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage{
  //description = "HOUSE BLEND COFFEE";
  public HouseBlend(){ 
    description = "HOUSE BLEND COFFEE";
  }
  //public String getDescription(){
  //return description;
  //}
  //public abstract double cost()
  public double cost(){
    return 0.89;
  }
}

      