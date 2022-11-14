package command_pattern.invoker;

import command_pattern.command.Command;

public class SimpleRemoteControl {
    Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
