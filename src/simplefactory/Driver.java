package simplefactory;

public class Driver {

    public static ICar driveCar(String s) throws Exception {
        if (s.equalsIgnoreCase("Benz")) {
            return new Benz();
        } else if (s.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (s.equalsIgnoreCase("Audi")) {
            return new Audi();
        } else {
            throw new Exception();
        }
    }

}
