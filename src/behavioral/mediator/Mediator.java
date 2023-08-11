package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(String message, Colleague colleague) {
        colleagues.stream()
                .filter(otherColleague -> otherColleague != colleague)
                .forEach(otherColleague -> otherColleague.receive(message));
    }
}