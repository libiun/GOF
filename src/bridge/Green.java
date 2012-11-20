package bridge;

public class Green implements IColor {

    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "绿色的" + name + "。");
    }
}
