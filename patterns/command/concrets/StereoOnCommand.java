package patterns.command.concrets;

import patterns.command.Command;
import patterns.command.receivers.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    public void undo(){
        stereo.off();
    }
}
