package command_pattern.command;

import command_pattern.receiver.Light;

public class LightOffCommand implements Command{
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {

    }
}
