package Chapter2_OOO_Encapsulation;

import Chapte1_OOO_FinalExercise.Employee;

public class Main_Chapter2 {


    public static void main(String[] args) {

       Employee_Chapter2 ray = new Employee_Chapter2("Ray", 69, 80, "Austin, TX" );
        double increasedSalary;

        ray.projectedSalaryPerYear();
        increasedSalary = ray.increaseSalaryPerYearProjected();
        System.out.println("Increase per year: " + increasedSalary);

        //Getting some values throught the getters
        System.out.println("The name coming from the employee" +
                "class is: " + ray.getName() );

        //Setting a value using a getter method
        ray.setName("Raymundo");
        System.out.println("The instance object is: : " + ray);

        //Retrieving name updated
        System.out.println("The updated name from the employee" +
                "class is: " + ray.getName() );
        System.out.println("The instance object is: : " + ray);



    }
}
