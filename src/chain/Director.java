package chain;
//主任类
public class Director extends Leader {
    
    public Director(String name) {
        super(name);
    }
    
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 3) {
            System.out.println("主任" + name + "审批员工" + leaveRequest.getLeaveName() + "的假条，请假天数为"
                    + leaveRequest.getLeaveDays() + "天。");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
