package command_pattern;

import command_pattern.command.GarageDoorOpenCommand;
import command_pattern.command.LightOffCommand;
import command_pattern.command.LightOnCommand;
import command_pattern.command.StereoOnWithCDCommand;
import command_pattern.invoker.RemoteControl;
import command_pattern.receiver.GarageDoor;
import command_pattern.receiver.Light;
import command_pattern.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOpenCommand, stereoOnWithCDCommand);
        System.out.println("remoteControl.toString() = " + remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(0);
        remoteControl.offButtonWasPressed(1);
    }
}
