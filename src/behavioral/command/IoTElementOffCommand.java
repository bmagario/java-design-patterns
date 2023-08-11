package behavioral.command;

public class IoTElementOffCommand implements Command {

    private IoTElement iotElement;

    public IoTElementOffCommand(IoTElement iotElement) {
        this.iotElement = iotElement;
    }

    @Override
    public void execute() {
        iotElement.turnOff();
    }

}
