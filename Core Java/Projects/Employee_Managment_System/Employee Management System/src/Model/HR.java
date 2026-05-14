package Model;

public class HR extends Employee{

    double commission;
    public HR( int employeeId, String employeeName,double salary,double commission) {
        super( employeeId, employeeName,salary);
        this.commission = commission;
    }
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return super.toString()+"\ncommission=" + commission;
    }
}
