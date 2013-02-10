package dip.lab1.student.solution1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @bspor
 */
public abstract class Employee {
    //In this problem the 'requirement' is an output of anual compensation
    //Because of this requirement, there is nothing that the subclasses can
    //usefully inherit from the super class, except for the fact they all get paid.
    //So this super class in this case should be abstract with an abstract method.
    //Because of this, it could have also been an interface
    public abstract double annualCompensation();
}
