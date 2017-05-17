package headfirst.command.undoHomeWork;


public class RemoteLoader {
 
 public static void main(String[] args) {
  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
  DVD dvdRemote = new DVD();

  DVDplayOnCommand dvdRemoteplayOn = new DVDplayOnCommand(dvdRemote);
  DVDplayOffCommand dvdRemoteplayOff = new DVDplayOffCommand(dvdRemote);

  DVDSubOnCommand dvdRemotesubOn = new DVDSubOnCommand(dvdRemote);
  DVDSubOffCommand dvdRemotesubOff = new DVDSubOffCommand(dvdRemote);
  
  DVDplayNextCommand dvdRemotenext = new DVDplayNextCommand(dvdRemote);
  DVDplayPrevCommand dvdRemoteprev = new DVDplayPrevCommand(dvdRemote);
  
  DVDRecOnCommand dvdRemoterecOn = new DVDRecOnCommand(dvdRemote);
  DVDRecOffCommand dvdRemoterecOff = new DVDRecOffCommand(dvdRemote);
  
  remoteControl.setCommand(0, dvdRemoteplayOn, dvdRemoteplayOff, dvdRemotesubOn, dvdRemotesubOff, dvdRemotenext, 
                           dvdRemoteprev, dvdRemoterecOn, dvdRemoterecOff);
 
  remoteControl.playonButtonWasPushed(0);
  remoteControl.playoffButtonWasPushed(0);
  System.out.println(remoteControl);
  remoteControl.reconButtonWasPushed(0);
  remoteControl.undoButtonWasPushed();
  remoteControl.suboffButtonWasPushed(0);
  remoteControl.subonButtonWasPushed(0);
  remoteControl.playnextButtonWasPushed(0);
  remoteControl.playprevButtonWasPushed(0);
  remoteControl.recoffButtonWasPushed(0);
  remoteControl.undoButtonWasPushed();
  System.out.println(remoteControl);
 }
}