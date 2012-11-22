package mediator;

import java.util.HashMap;

public class ConcerteChatroom extends AbstractChatroom {

    protected HashMap<String, AbstractMember> members = new HashMap<String, AbstractMember>();

    @Override
    public void register(AbstractMember member) {
        if (!members.containsValue(member)) {
            members.put(member.getName(), member);
            member.setChatroom(this);
        }
    }

    @Override
    public void sendText(AbstractMember from, AbstractMember to, String message) {
        to.receiveText(from, message.replaceAll("日", "*"));
    }

    @Override
    public void sendImage(AbstractMember from, AbstractMember to, String image) {
        to.receiveImage(from, image);
    }
}
