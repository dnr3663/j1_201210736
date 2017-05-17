package headfirst.command.undoHomeWork;
 
public class DVD{
  int recon;
  public void dvdplayon(){
    System.out.println("video is playing now");
  }
  public void dvdplayoff(){
    System.out.println("video is stopped now");
  }
  
  public void dvdSubOn(){
    System.out.println("video shows the subtitle");
  }
  public void dvdSubOff(){
    System.out.println("video stop showing subtitle");
  }
  public void dvdplayNext(){
    System.out.println("video shows next video");
  }
  public void dvdplayPrev(){
    System.out.println("video shows Previous video");
  }
  public void dvdRecOn(){
    recon = 100;
    System.out.println("video REC is on now");
  }
  public void dvdRecOff(){
    recon = 0;
    System.out.println("video REC is off now");
  }
  
  public void dvdRec(int recon){
    this.recon = recon;
    if(recon == 0 ){
      System.out.println("video is not recording now");
    }
    else {
      System.out.println("video is recording now" + "  on?" + recon);
    }
  }
  public int getRecon(){
    return recon;
  }
}

  