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
      System.out.println("quack quack!!!");
    }
    public void performFly(){
      flyBehavior.fly();
      System.out.println("All docks fly...");
    }

    abstract void display();
    public void swim(){
      System.out.println("All ducks float, even decdoys!");
    }
}
