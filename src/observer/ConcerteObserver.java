/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author
 * Administrator
 */
public class ConcerteObserver implements IObserver {

    @Override
    public void update(String string) {
        System.out.print("接收对象发过来的信息:"+string);
        System.out.println(", 我就说:太好了！");
    }
}
