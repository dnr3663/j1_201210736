package headfirst.command.undoHomeWork;

public class DVDplayOffCommand implements Command{
  DVD dvd;
   int recon;
  public DVDplayOffCommand(DVD dvd){
    this.dvd = dvd;
  }
  
  public void execute(){
    dvd.dvdplayoff();
  }
    public void undo(){
    dvd.dvdRec(recon);
}
}
  