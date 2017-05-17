package headfirst.command.undoHomeWork;

public class DVDRecOffCommand implements Command{
  DVD dvd;
  int recon;
  public DVDRecOffCommand(DVD dvd){
    this.dvd = dvd;
  }
  
  public void execute(){
    recon = dvd.getRecon();
    dvd.dvdRecOff();
  }
  public void undo(){
    dvd.dvdRec(recon);
  }
}

  