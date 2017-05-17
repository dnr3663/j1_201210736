package headfirst.command.undoHomeWork;

public class DVDSubOnCommand implements Command{
  DVD dvd;
   int recon;
  public DVDSubOnCommand(DVD dvd){
    this.dvd = dvd;
  }
  
  public void execute(){
    dvd.dvdSubOn();
  }
    public void undo(){
    dvd.dvdRec(recon);
}
}