package Model;

public class SalesManager extends Employee{

    double incentive;
    int target;

    public SalesManager(int employeeId, String employeeName,double salary,  double incentive,int target) {
        super( employeeId, employeeName,salary);
        this.incentive = incentive;
        this.target=target;
    }

    public double getIncentive() {
        return incentive;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nincentive=" + incentive +
                "\ntarget=" + target ;
    }
}
