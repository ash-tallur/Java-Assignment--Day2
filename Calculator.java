/*Create a simple calculator which can perform following operations with two numbers
1. add 2. multi 3. division 4. sub
Note: Program should take continuous input on what operation to perform from user. Should take inputs required for operation and print output at every operation. */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hi I am the Calculator, choose these options for the operation you prefer :\n 1. Add \n 2. Multiplication \n 3. Division \n 4. Subtraction \n ");
        Scanner sc = new Scanner(System.in);
        int option;
        int exitcriteria;
        float num1;
        float num2;
        do {
            System.out.println("Enter your option");
            option = sc.nextInt();
            //If option value is more than 4 then asking user to choose right option
            if(option>4){
                System.out.println("Choose the right option");
            }
            else {
                //Taking input from the users
                System.out.println("Enter the two numbers for the preferred operation");
                System.out.println("Enter number1");
                num1 = sc.nextFloat();
                System.out.println("Enter number2");
                num2 = sc.nextFloat();

                switch (option) {
                    case 1:
                        float summation = num1 + num2;
                        System.out.println("Addition of " + num1 + " and " + num2 + " is " + summation);
                        break;
                    case 2:
                        float product = num1 * num2;
                        System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
                        break;
                    case 3:
                        if (num2 == 0) {
                            System.out.println("Denominator cannot be zero");
                        } else {
                            float quotient = num1 / num2;
                            System.out.println("Division of " + num1 + " and " + num2 + " is " + quotient);
                        }
                        break;
                    case 4:
                        float remainder = num1 - num2;
                        System.out.println("Difference of " + num1 + " and " + num2 + " is " + remainder);
                        break;
                    default:
                        System.out.println("Choose the right option with right set of numbers");
                        break;
                }
            }
                //Giving an option for user to continue calculator or no
                System.out.println("Do you want to continue? 1. Yes 2. No ");
                exitcriteria = sc.nextInt();

        }while(exitcriteria==1);
    }
}
