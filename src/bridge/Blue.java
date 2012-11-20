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
public class Blue implements IColor {

    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "蓝色的" + name + "。");
    }
}
