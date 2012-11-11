package command;

public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ICommand command = new ConcerteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.doInvokerAction();
    }
}
