package dip.lab1.student.solution1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @bspor
 */
public class SalariedEmployee extends Employee {
    //annualSalary and annualBonus will be unique to SalariedEmployee
    
    //Variables 
    private double annualSalary, annualBonus;
    
    
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public double annualCompensation() {
        return (annualSalary + annualBonus);
    }
}
