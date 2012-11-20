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
public class SmallPen extends Pen {

    private String penType = "小号毛笔";

    @Override
    public void draw(String name) {
        this.color.bepaint(penType, name);
    }
}
