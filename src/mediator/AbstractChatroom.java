package mediator;

public abstract class AbstractChatroom {

    public abstract void register(AbstractMember member);

    public abstract void sendText(AbstractMember from, AbstractMember to, String message);

    public abstract void sendImage(AbstractMember from, AbstractMember to, String image);
}
