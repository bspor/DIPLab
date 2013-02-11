package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        //Low-level modules
        Employee emp1 = new HourlyEmployee(10.50, 2020);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);

        // High-level module --- I am changing this svc to PayEmployeeSvc
        //HRService hr = new HRService(); Ill keep hr as my object name
        
        //I tested this way vs the way I left in the code
        //Is there a preferred method?
//        PayEmployeeSvc hr = new PayEmployeeSvc(emp1);
//        PayEmployeeSvc hr1 = new PayEmployeeSvc(emp2);
//        PayEmployeeSvc hr2 = new PayEmployeeSvc(emp3);
        PayEmployeeSvc hr = new PayEmployeeSvc();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
        System.out.println("Employee 1 annual compensation: " +
            nf.format(hr.getPayEmployee(emp1)));
        System.out.println("Employee 2 annual compensation: " +
            nf.format(hr.getPayEmployee(emp2)));
        System.out.println("Employee 3 annual compensation: " +
            nf.format(hr.getPayEmployee(emp3)));
    }
}
