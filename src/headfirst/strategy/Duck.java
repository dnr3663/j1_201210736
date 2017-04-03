package headfirst.strategy;

public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void setFlyBehavior(FlyBehavior fb) {
      flyBehavior =fb;
    }
    public void setQuackBehavior(QuackBehavior fb){
      quackBehavior = fb;
    }
    public void performQuack(){
      quackBehavior.quack();
    }
    public void performFly(){
      flyBaaehavior.fly();
      System.out.println("All docks fly...");
    }

    abstract void display();
    public void swim(){
      System.out.println("All ducks float, even decdoys!");
    }
}
