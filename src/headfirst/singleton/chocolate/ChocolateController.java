package headfirst.singleton.chocolate;

public class ChocolateController {
  public static void main(String[] args){
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();
    
    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    ChocolateBoiler boiler3 = ChocolateBoiler.getInstance();
     ChocolateBoiler boiler4 = ChocolateBoiler.getInstance();
      ChocolateBoiler boiler5 = ChocolateBoiler.getInstance();
  }
}
