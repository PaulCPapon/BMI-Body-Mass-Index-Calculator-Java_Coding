package BMIcalculator;
import java.util.Scanner;

public class Main {
    /*Void function to print Welcome message.
    It demonstrates to user what the program do*/
    public static void Welcome(){
        System.out.println("Welcome to the BMI Calculator App. \n" +
                "This App will show your Body Mass Index");
    }


    public static void main(String[] args) {
        //Calling the Welcome function
        Welcome();

        //Boolean Variable initialized false.
        boolean error = false;

        do {
            try{
                //Declaration of Scanner class
                Scanner input = new Scanner(System.in);
                //Asking First input from users.
                System.out.println("Please entre your weight in kilogram");
                //Store First input
                double Weight = input.nextDouble();
                //Asking Second input from users.
                System.out.println("Please entre your height now in meters");
                //Store Second input
                double Height = input.nextDouble();
                //Calculation of BMI and store it.
                double BMI_Value = Weight/(Height* Height);
                //Converting from double to String to get 2 decimal value.
                System.out.println("Your Body Mass Index(BMI) is "+String.format("%.2f", BMI_Value));
                //If statement for different scenario.
                if (BMI_Value <= 18.5 ) {
                    System.out.print("Your result suggest you are underweight");
                }
                else if (BMI_Value <= 24.9 ) {
                    System.out.println("Your result suggest you are Healthy weight");
                }
                else {
                    System.out.println("Your result suggest you are overweight");
                }
                //break to go outside the loop
                break;}
            //To check if there is any other type of inout different from positive integer value.
            catch (Exception e) {
                //Error message to show
                System.out.println("Sorry your input is invalid, entre a positive value number");
                // Error variable initialized True.
                error = true;
            }
        }
        //Closing of Do While Loop and error checking
        while (error == true);
    }
}
