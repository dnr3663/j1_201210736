package headfirst.singleton.chocolate;
public class ChocolateBoiler{
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;
  
  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }
  
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      System.out.println("Creating unique In");
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("Returning in...");
    System.out.println("jsl: numCalled " + numCalled++);
    return uniqueInstance;
  }
    
    public void fill(){
      if(isEmpty()){
        empty = false;
        boiled = false;
      }
    }
    
    public void drain(){
      if(!isEmpty() && isBoiled()){
        empty = true;
      }
    }
    
    public void boil(){
      if(!isEmpty() && isBoiled()){
        boiled = true;
      }
    }
    
    public boolean isEmpty(){
      System.out.println("empty");
      return empty;
    }
    public boolean isBoiled(){
      System.out.println("boiled");
      
      return boiled;
    }
  }
  