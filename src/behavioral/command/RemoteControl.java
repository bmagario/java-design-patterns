package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void buttonPressed() {
        for (Command command : commands) {
            command.execute();
        }
    }

}
