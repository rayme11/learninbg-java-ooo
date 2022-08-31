package Chapter2_OOO_Encapsulation;

public class Employee_Chapter2 {

    private String name;
    private int age;
    private double salaryPerHour;
    private String location;
    private static double increaseInSalaryPercentage = .03;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static double getIncreaseInSalaryPercentage() {
        return increaseInSalaryPercentage;
    }

    public static void setIncreaseInSalaryPercentage(double increaseInSalaryPercentage) {
        Employee_Chapter2.increaseInSalaryPercentage = increaseInSalaryPercentage;
    }

    public Employee_Chapter2(String name, int age, double salaryPerHour, String location) {
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
