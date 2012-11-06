package factorymethod;

public class BMW implements ICar {

    @Override
    public void drive() {
        System.out.println("Drive car: BMW");
    }
}
