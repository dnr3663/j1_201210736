package headfirst.command.simpleremote;

import java.util.*;

public class SimpleRemoteControl{
  Command slot;
  
  public SimpleRemoteControl(){}
  
  public void setCommand(Command c){ //실제개체와 버튼이 아닌 command와 button을 열결
    slot = c;
  }
  
  public void buttonWasPressed(){
    slot.execute();
  }
}
// import headfirst.command.simpleremote.*;
 //Light light = new Light();
 //LightOnCommand lightOn = new LightOnCommand(light);
 //SimpleRemoteControl remote = new SimpleRemoteControl();
 //remote.setCommand(lightOn);
 //remote.buttonWasPressed();
//Light is on 
 //LightOffCommand lightOff = new LightOffCommand(light);
 //remote.setCommand(lightOff);
 //remote.buttonWasPressed();
//Light is off 
 //remote.setCommand(lightOn);
 //remote.buttonWasPressed();
//Light is on 
 //SimpleRemoteControl = remote2 = new SimpleRemoteControl();
//Static Error: Undefined name 'SimpleRemoteControl'
 //LightOffCommand lightOff = new LightOffCommand(light);
 //SimpleRemoteControl remote2 = new SimpleRemoteControl();
 //remote2.setCommand(lightOff);
 //remote2.buttonWasPressed();
//Light is off 
// remote.buttonWasPressed();
//Light is on 
 