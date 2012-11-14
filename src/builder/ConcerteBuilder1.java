package builder;

public class ConcerteBuilder1 extends AbstractBuilder {

    @Override
    public void buildFangxiangpan() {
        car.setFangxiangpan("奔驰方向盘");
    }

    @Override
    public void buildLuntai() {
        car.setLuntai("奔驰轮胎");
    }

    @Override
    public void buildFadongji() {
        car.setFadongji("奔驰发动机");
    }
}
