package Chapte1_OOO_FinalExercise;

public class Main {


    public static void main(String[] args) {

        Employee ray = new Employee("Ray", 69, 80, "Austin, TX" );
        double increasedSalary;

        ray.projectedSalaryPerYear();
        increasedSalary = ray.increaseSalaryPerYearProjected();
        System.out.println("Increase per year: " + increasedSalary);
    }
}
