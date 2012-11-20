package chain;

public class Client {

    public static void main(String[] args) {
        Leader objDirector, objManager, objGeneralManager;
        objDirector = new Director("向文军");
        objManager = new Manager("黄波");
        objGeneralManager = new GeneralManager("周定文");

        objDirector.setNextLeader(objManager);
        objManager.setNextLeader(objGeneralManager);

        LeaveRequest leave = new LeaveRequest("李俊", 2);
        objDirector.handleRequest(leave);

        LeaveRequest leave2 = new LeaveRequest("李俊", 5);
        objDirector.handleRequest(leave2);

        LeaveRequest leave3 = new LeaveRequest("李媛", 50);
        objDirector.handleRequest(leave3);

    }
}
