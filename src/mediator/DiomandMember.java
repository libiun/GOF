package mediator;

public class DiomandMember extends AbstractMember {

    public DiomandMember(String name) {
        super(name);
    }

    @Override
    public void sendText(AbstractMember to, String message) {
        System.out.println("钻石会员发送消息：");
        chatroom.sendText(this, to, message);
    }

    @Override
    public void sendImage(AbstractMember to, String image) {
        System.out.println("钻石会员发送图片：");
        chatroom.sendText(this, to, image);
    }
}
