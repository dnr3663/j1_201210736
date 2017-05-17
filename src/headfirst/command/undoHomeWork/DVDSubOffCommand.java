package headfirst.command.undoHomeWork;

public class DVDSubOffCommand implements Command{
  DVD dvd;
   int recon;
  public DVDSubOffCommand(DVD dvd){
    this.dvd = dvd;
  }
  
  public void execute(){
    dvd.dvdSubOff();
  }
    public void undo(){
    dvd.dvdRec(recon);
}
}