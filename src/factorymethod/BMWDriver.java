package factorymethod;

public class BMWDriver implements IDriver {

    @Override
    public ICar driveCar() {
        return new BMW();
    }
}
