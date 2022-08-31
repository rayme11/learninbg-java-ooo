package Chapte1_OOO_FinalExercise;

public class Employee {

    private final String name;
    private int age;
    private double salaryPerHour;
    private String location;
    private static double increaseInSalaryPercentage = .03;

    public Employee(String name, int age, double salaryPerHour, String location) {
        this.name = name;
        this.age = age;
        this.salaryPerHour = salaryPerHour;
        this.location = location;
    }

    public void projectedSalaryPerYear(){
        System.out.println("Yearly Projected Salary is: " + (salaryPerHour * 40 * 52));
    }

    public double increaseSalaryPerYearProjected(){
        return (salaryPerHour * 40 * 52) * increaseInSalaryPercentage;
    }


}
