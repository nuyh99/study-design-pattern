package command_pattern.command;

import command_pattern.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command{
    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
