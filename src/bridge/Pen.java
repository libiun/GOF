/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author
 * Administrator
 */
public abstract class Pen {

    protected IColor color;

    public void setColor(IColor color) {
        this.color = color;
    }

    public abstract void draw(String name);
}
