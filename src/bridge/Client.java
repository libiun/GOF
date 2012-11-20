package bridge;

public class Client {

    public static void main(String[] args) {
        Pen pen;

        pen = new BigPen();
        pen.setColor(new Black());
        pen.draw("鲜花");

        pen = new SmallPen();
        pen.setColor(new Green());
        pen.draw("猪头");
    }
}
