package chain;

public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 30) {
            System.out.println("主任" + name + "审批员工" + leaveRequest.getLeaveName() + "的假条，请假天数为"
                    + leaveRequest.getLeaveDays() + "天。");
        } else {
            System.out.println("莫非" + leaveRequest.getLeaveName()
                    + "想辞职，竟然请假" + leaveRequest.getLeaveDays() + "天。");
        }
    }
}
