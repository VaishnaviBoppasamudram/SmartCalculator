
package SmartCalculator; 

import java.net.SocketPermission;
import java.util.Scanner;

public class SmartCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

    

        while (continueCalculation) {
            try {
                // Accept user inputs
                System.out.println("Enter the first number: ");
                double num1 = scanner.nextDouble();
               
                System.out.println("Enter the operator (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

                System.out.println("Enter the second number: ");
                double num2 = scanner.nextDouble();



                // Perform calculation
                double result;
                switch (operation) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operation.");
                }

            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter numeric values.");
                scanner.nextLine(); // Clear the invalid input
            
            
           
        }
       

        
        
    }


}	

	}



