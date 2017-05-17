package headfirst.command.undoHomeWork;

public class DVDRecOnCommand implements Command{
  DVD dvd;
  int recon;
  public DVDRecOnCommand(DVD dvd){
    this.dvd = dvd;
  }
  
  public void execute(){
    recon = dvd.getRecon();
    dvd.dvdRecOn();
  }
  public void undo(){
    dvd.dvdRec(recon);
  }
}

  