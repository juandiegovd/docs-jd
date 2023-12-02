package patterns.command.concrets;

import patterns.command.Command;
import patterns.command.receivers.Light;

public class LightOffCommand implements Command {
    Light light;
    
    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }

    public void undo(){
        light.on();
    }
}
