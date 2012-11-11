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

    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void doInvokerAction() {
        command.execute();
    }
}
