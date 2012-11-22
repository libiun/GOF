package mediator;

public class CommonMember extends AbstractMember {

    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(AbstractMember to, String message) {
        System.out.println("普通会员发送消息：");
        chatroom.sendText(this, to, message);
    }

    @Override
    public void sendImage(AbstractMember to, String image) {
        System.out.println("普通会员不能发送照片");
    }
}
