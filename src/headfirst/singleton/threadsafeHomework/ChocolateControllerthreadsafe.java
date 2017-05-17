package headfirst.singleton.threadsafeHomework;
 
public class ChocolateControllerthreadsafe {
 public static void main(String args[]) {
  ChocolateBoilerthreadsafe boiler = ChocolateBoilerthreadsafe.getInstance();
  boiler.fill();
  boiler.boil();
  boiler.drain();

  ChocolateBoilerthreadsafe boiler2 = ChocolateBoilerthreadsafe.getInstance();
  ChocolateBoilerthreadsafe boiler3 = ChocolateBoilerthreadsafe.getInstance();
 }
}
