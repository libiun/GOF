package simplefactory;

public class Client {

    public static void main(String[] args) {
        try {
            ICar car = Driver.driveCar("Audi");
            car.drive();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
