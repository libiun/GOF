package chain;

public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 10) {
            System.out.println("经理" + name + "审批员工" + leaveRequest.getLeaveName() + "的假条，请假天数为"
                    + leaveRequest.getLeaveDays() + "天。");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
