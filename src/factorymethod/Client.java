package factorymethod;

public class Client {

    public static void main(String[] args) {
        IDriver driver = new AudiDriver();
        ICar car = driver.driveCar();
        car.drive();
    }
}
