package factorymethod;

public class AudiDriver implements IDriver {

    @Override
    public ICar driveCar() {
        return new Audi();
    }
}
