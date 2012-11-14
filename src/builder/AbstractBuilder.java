package builder;

public abstract class AbstractBuilder {

    protected Car car = new Car();

    public abstract void buildFangxiangpan();

    public abstract void buildLuntai();

    public abstract void buildFadongji();

    public Car getCar() {
        return car;
    }
}
