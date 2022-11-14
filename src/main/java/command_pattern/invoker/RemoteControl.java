package command_pattern.invoker;

import command_pattern.command.Command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private final List<Command> onCommands=new ArrayList<>();
    private final List<Command> offCommands=new ArrayList<>();

    public RemoteControl() {
        for(int i=0; i<7; i++) {
            onCommands.add(null);
            offCommands.add(null);
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands.set(slot, onCommand);
        this.offCommands.set(slot, offCommand);
    }

    public void onButtonWasPressed(int slot) {
        onCommands.get(slot).execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands.get(slot).execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + onCommands +
                ", offCommands=" + offCommands +
                '}';
    }
}
