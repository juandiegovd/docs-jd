package patterns.command;

import patterns.command.concrets.*;
import patterns.command.receivers.*;
import patterns.command.invoker.RemoteControlWithUndo;

public class RemoteLoader {
    public static void main(String[] args){
        Light light = new Light("Kitchen");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFan ceilingFan = new CeilingFan("Kitchen");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);


        RemoteControlWithUndo control = new RemoteControlWithUndo();
        control.setCommand(0, lightOnCommand, lightOffCommand);
        control.setCommand(1, stereoOnCommand, stereoOffCommand);
        control.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
        control.setCommand(3, ceilingFanMediumCommand, ceilingFanOffCommand);
        control.setCommand(4, ceilingFanLowCommand, ceilingFanOffCommand);
        
        control.onButtonWasPushed(0);
        control.onButtonWasPushed(1);
        control.onButtonWasPushed(2);
        control.onButtonWasPushed(3);
        control.undoButtonWasPushed();
        control.onButtonWasPushed(4);

    }
}