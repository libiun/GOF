package builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new ConcerteBuilder1());
        Car benz = director.construct();
        System.out.println(benz.getFangxiangpan());
        System.out.println(benz.getFadongji());
        System.out.println(benz.getLuntai());
        benz.drive();

        director.setBuilder(new ConcerteBuilder2());
        Car bmw = director.construct();
        System.out.println(bmw.getFangxiangpan());
        System.out.println(bmw.getFadongji());
        System.out.println(bmw.getLuntai());
        bmw.drive();
    }
}
