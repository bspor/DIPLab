package dip.lab1.student.solution1;

/**
 *
 * @author Brandon
 */
public class PayEmployeeSvc {
   //My Service Class
    private Employee payEmployee;

    public PayEmployeeSvc(Employee payEmployee) {
        this.payEmployee = payEmployee;
    }

    public double getPayEmployee() {
        return payEmployee.annualCompensation();
    }
}
