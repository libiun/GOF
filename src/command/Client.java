package command;

public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcerteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.doInvokerAction();
    }
}
