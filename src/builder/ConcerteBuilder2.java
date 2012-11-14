package builder;

public class ConcerteBuilder2 extends AbstractBuilder {

    @Override
    public void buildFangxiangpan() {
        car.setFangxiangpan("宝马方向盘");
    }

    @Override
    public void buildLuntai() {
        car.setLuntai("宝马轮胎");
    }

    @Override
    public void buildFadongji() {
        car.setFadongji("宝马发动机");
    }
}
