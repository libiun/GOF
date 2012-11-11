package composite;

public class Client {

    public static void main(String[] args) {
        Composite com1 = new Composite();
        IComponent leaf1 = new Leaf();
        IComponent leaf2 = new Leaf();
        com1.add(leaf1);
        com1.add(leaf2);

        Composite com2 = new Composite();
        IComponent leaf3 = new Leaf();
        IComponent leaf4 = new Leaf();
        com2.add(leaf3);
        com2.add(leaf4);
        com2.add(com1);

        com2.dosth();
    }
}
