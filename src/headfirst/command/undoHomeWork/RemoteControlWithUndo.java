package headfirst.command.undoHomeWork;

import java.util.*;

public class RemoteControlWithUndo {
 Command[] playonCommands;
 Command[] playoffCommands;
 Command[] subonCommands;
 Command[] suboffCommands;
 Command[] playnextCommands;
 Command[] playprevCommands;
 Command[] reconCommands;
 Command[] recoffCommands;
 
 Command undoCommand;
 
 public RemoteControlWithUndo() {
  playonCommands = new Command[7];
  playoffCommands = new Command[7];
  subonCommands = new Command[7];
  suboffCommands = new Command[7]; 
  playnextCommands = new Command[7];
  playprevCommands = new Command[7]; 
  reconCommands = new Command[7];
  recoffCommands = new Command[7];
  Command noCommand = new NoCommand();
  for(int i=0;i<7;i++) {
   playonCommands[i] = noCommand;
   playoffCommands[i] = noCommand;
   subonCommands[i] = noCommand;
   suboffCommands[i] = noCommand;
   playnextCommands[i] = noCommand;
   playprevCommands[i] = noCommand;
   reconCommands[i] = noCommand;
   recoffCommands[i] = noCommand;
   }
  undoCommand = noCommand;
 }
  
 public void setCommand(int slot, Command playonCommand, Command playoffCommand, 
                        Command subonCommand, Command suboffCommand,
                        Command playnextCommand, Command playprevCommand,
                        Command reconCommand, Command recoffCommand) {
  playonCommands[slot] = playonCommand;
  playoffCommands[slot] = playoffCommand;
  subonCommands[slot] = subonCommand;
  suboffCommands[slot] = suboffCommand;
  playnextCommands[slot] = playnextCommand;
  playprevCommands[slot] = playprevCommand;
  reconCommands[slot] = reconCommand;
  recoffCommands[slot] = recoffCommand;

 }
 
 public void playonButtonWasPushed(int slot) {
  playonCommands[slot].execute();
  undoCommand = playonCommands[slot];
 }
 
 public void playoffButtonWasPushed(int slot) {
  playoffCommands[slot].execute();
  undoCommand = playoffCommands[slot];
 }
 
 public void subonButtonWasPushed(int slot) {
  subonCommands[slot].execute();
  undoCommand = subonCommands[slot];
 }
 
 public void suboffButtonWasPushed(int slot) {
  suboffCommands[slot].execute();
  undoCommand = suboffCommands[slot];
 }
 
 public void playnextButtonWasPushed(int slot) {
  playnextCommands[slot].execute();
  undoCommand = playnextCommands[slot];
 }
 
 public void playprevButtonWasPushed(int slot) {
  playprevCommands[slot].execute();
  undoCommand = playprevCommands[slot];
 }
 
 public void reconButtonWasPushed(int slot) {
  reconCommands[slot].execute();
  undoCommand = reconCommands[slot];
 }
 
 public void recoffButtonWasPushed(int slot) {
  recoffCommands[slot].execute();
  undoCommand = recoffCommands[slot];
 }
 
 
 public void undoButtonWasPushed() {
  undoCommand.undo();
 }
 public String toString() {
  StringBuffer stringBuff = new StringBuffer();
  stringBuff.append("\n------ Remote Control -------\n");
  for (int i = 0; i < reconCommands.length; i++) {
   stringBuff.append("[slot " + i + "] " + reconCommands[i].getClass().getName()
    + "    " + recoffCommands[i].getClass().getName() + "\n");
  }
  stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
  return stringBuff.toString();
 }
}



