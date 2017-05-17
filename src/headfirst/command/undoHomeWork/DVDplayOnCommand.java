package headfirst.command.undoHomeWork;

public class DVDplayOnCommand implements Command{
  DVD dvd;
   int recon;
  public DVDplayOnCommand(DVD dvd){
    this.dvd = dvd;
  }
  
  public void execute(){
    dvd.dvdplayon();
  }
    public void undo(){
    dvd.dvdRec(recon);
}
}