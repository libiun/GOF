package composite2;

public class Client {

    public static void main(String[] args) {
        Component com1 = new Composite();
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        com1.add(leaf1);
        com1.add(leaf2);

        Component com2 = new Composite();
        Component leaf3 = new Leaf();
        Component leaf4 = new Leaf();
        com2.add(leaf3);
        com2.add(leaf4);
        com2.add(com1);

        com2.dosth();
    }
}
