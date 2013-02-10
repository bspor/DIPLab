package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee extends Employee {
    //This class will caclulate the anual compensation of a hourly employee
    //by doing hourlyRate * totalHrsForYear. This ignores overtime.
    
    //Variables
    private double hourlyRate, totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }
    
    

}
