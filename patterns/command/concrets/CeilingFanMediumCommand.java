package patterns.command.concrets;

import patterns.command.Command;
import patterns.command.receivers.CeilingFan;

public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    public void undo(){
        if (prevSpeed == 3){
            ceilingFan.high();
        }else if (prevSpeed == 2){
            ceilingFan.medium();
        }else if (prevSpeed == 1){
            ceilingFan.low();
        }else if (prevSpeed == 0){
            ceilingFan.off();
        }
    }
}
