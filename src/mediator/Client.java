package mediator;

public class Client {

    public static void main(String[] args) {
        AbstractChatroom chatroom = new ConcerteChatroom();
        AbstractMember member1, member2, member3, member4;

        member1 = new CommonMember("common steven");
        member2 = new CommonMember("common rose");
        member3 = new DiomandMember("diomand jack");
        member4 = new DiomandMember("diomand lijun");
        chatroom.register(member1);
        chatroom.register(member2);
        chatroom.register(member3);
        chatroom.register(member4);

        member1.sendText(member2, "1 fuck 2");
        member1.sendText(member1, "1 fuck himself");
        member1.sendImage(member4, "1 send image to 4");
        member3.sendText(member4, "3 send image to 4");
    }
}
