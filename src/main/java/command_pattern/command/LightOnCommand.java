package command_pattern.command;

import command_pattern.receiver.Light;

public class LightOnCommand implements Command{
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {

    }
}
