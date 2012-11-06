package factorymethod;

public class BenzDriver implements IDriver {

    @Override
    public ICar driveCar() {
        return new Benz();
    }
}
