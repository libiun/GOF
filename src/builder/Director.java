package builder;

public class Director {

    private AbstractBuilder builder;

    public Director() {
    }

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Car construct() {
        builder.buildFangxiangpan();
        builder.buildLuntai();
        builder.buildFadongji();
        return builder.getCar();
    }
}
