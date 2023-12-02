package patterns.command.concrets;

import patterns.command.receivers.CeilingFan;
import patterns.command.Command;

public class CeilingFanHighCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
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
