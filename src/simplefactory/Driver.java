package simplefactory;

public class Driver {

    public static Car driveCar(String s) {
        if (s.equalsIgnoreCase("Benz")) {
            return new Benz();
        } else if (s.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (s.equalsIgnoreCase("Audi")) {
            return new Audi();
        }
        return null;
    }
}
