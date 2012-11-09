/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author
 * Administrator
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void doInvokerAction() {
        command.execute();
    }
}
