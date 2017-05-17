package headfirst.command.undoHomeWork;

public class DVDplayPrevCommand implements Command{
  DVD dvd;
   int recon;
  public DVDplayPrevCommand(DVD dvd){
    this.dvd = dvd;
  }
  
  public void execute(){
    dvd.dvdplayPrev();
  }
    public void undo(){
    dvd.dvdRec(recon);
}
}