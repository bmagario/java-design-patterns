package behavioral.command;

public class Main {

    public static void main(String[] args) {
        IoTElement iotElement = new IoTElement();

        Command iotElementOnCommand = new IoTElementOnCommand(iotElement);

        Command iotElementOffCommand = new IoTElementOffCommand(iotElement);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.addCommand(iotElementOnCommand);
        remoteControl.addCommand(iotElementOffCommand);

        remoteControl.buttonPressed();
    }
}
