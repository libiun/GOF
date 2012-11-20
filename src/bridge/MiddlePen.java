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
public class MiddlePen extends Pen {

    private String penType = "中号毛笔";

    @Override
    public void draw(String name) {
        this.color.bepaint(penType, name);
    }
}
