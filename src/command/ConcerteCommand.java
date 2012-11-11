package command;

public class ConcerteCommand implements ICommand {

    private Receiver receiver;

    public ConcerteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doAction();
    }
}
