package behavioral.command;

public class IoTElementOnCommand implements Command {

    private IoTElement iotElement;

    public IoTElementOnCommand(IoTElement iotElement) {
        this.iotElement = iotElement;
    }

    @Override
    public void execute() {
        iotElement.turnOn();
    }

}
