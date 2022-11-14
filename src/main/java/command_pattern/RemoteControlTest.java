package command_pattern;

import command_pattern.command.LightOnCommand;
import command_pattern.invoker.SimpleRemoteControl;
import command_pattern.receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setSlot(new LightOnCommand(new Light()));

        remoteControl.buttonWasPressed();
    }
}
