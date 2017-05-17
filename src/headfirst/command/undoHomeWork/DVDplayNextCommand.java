package headfirst.command.undoHomeWork;

public class DVDplayNextCommand implements Command{
  DVD dvd;
  int recon;
  public DVDplayNextCommand(DVD dvd){
    this.dvd = dvd;
  }
  
  public void execute(){
    dvd.dvdplayNext();
  }
  public void undo(){
    dvd.dvdRec(recon);
}
}
  