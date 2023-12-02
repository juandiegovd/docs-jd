package patterns.command.concrets;

import patterns.command.Command;

public class NoCommand implements Command {
    public void execute(){}
    public void undo(){}
}
