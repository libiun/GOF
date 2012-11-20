package bridge;

public class Black implements IColor {

    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "黑色的" + name + "。");
    }
}
