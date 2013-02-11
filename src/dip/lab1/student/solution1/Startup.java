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
//                ////Food SVC calc
//       TipCalcAbstraction tip = new FoodServiceTipCalculator(ServiceQuality.GOOD, 34.0);
//        
//        //Bag calc
//       //TipCalcAbstraction tip = new BaggageServiceTipCalculator(ServiceQuality.FAIR, 5.0);
//        TipCalcSvc tipService = new TipCalcSvc(tip);
//        System.out.println("Your tip is: " + tipService.getTip() + "$.");

        //Low-level modules
        Employee emp1 = new HourlyEmployee(10.50, 2020);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);

        // High-level module --- I am changing this svc to PayEmployeeSvc
        //HRService hr = new HRService(); Ill keep hr as my object name
        PayEmployeeSvc hr = new PayEmployeeSvc(emp1);
        PayEmployeeSvc hr1 = new PayEmployeeSvc(emp2);
        PayEmployeeSvc hr2 = new PayEmployeeSvc(emp3);

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
        System.out.println("Employee 1 annual compensation: " +
            nf.format(hr.getPayEmployee()));
        System.out.println("Employee 2 annual compensation: " +
            nf.format(hr1.getPayEmployee()));
        System.out.println("Employee 3 annual compensation: " +
            nf.format(hr2.getPayEmployee()));
    }

}
