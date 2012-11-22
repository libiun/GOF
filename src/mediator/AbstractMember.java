package mediator;

public abstract class AbstractMember {

    protected AbstractChatroom chatroom;
    protected String name;

    public AbstractMember(String name) {
        this.name = name;
    }

    public AbstractChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbstractChatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void receiveText(AbstractMember from, String message) {
        System.out.println(from.getName() + "发送文本给" + this.name + ",内容为：" + message);
    }

    public void receiveImage(AbstractMember from, String image) {
        System.out.println(from.getName() + "发送图片给" + this.name + ",内容为：" + image);
    }

    public abstract void sendText(AbstractMember to, String message);

    public abstract void sendImage(AbstractMember to, String image);
}
