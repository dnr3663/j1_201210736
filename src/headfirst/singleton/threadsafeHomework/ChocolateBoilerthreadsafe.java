package headfirst.singleton.threadsafeHomework;

public class ChocolateBoilerthreadsafe{
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoilerthreadsafe uniqueInstance;
  private static int numCalled = 0;
  
  private ChocolateBoilerthreadsafe(){
    empty = true;
    boiled = false;
  }
  
  public static synchronized ChocolateBoilerthreadsafe getInstance(){
    if(uniqueInstance == null){
      System.out.println("Creating unique instance of Chocolate Boiler");
   uniqueInstance = new ChocolateBoilerthreadsafe();
  }
  System.out.println("Returning instance of Chocolate Boiler");
  System.out.println("jsl: numCalled "+numCalled++);
  return uniqueInstance;
 }

 public void fill() {
  if (isEmpty()) {
   empty = false;
   boiled = false;
  }
 }
 
 public void drain() {
  if (!isEmpty() && isBoiled()) {
   empty = true;
  }
 }
 
 public void boil() {
  if (!isEmpty() && !isBoiled()) {
   boiled = true;
  }
 }
  
 public boolean isEmpty() {
  return empty;
 }
 
 public boolean isBoiled() {
  return boiled;
 }
}