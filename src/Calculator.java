import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)          // main method
    {
        Scanner scanner = new Scanner(System.in);   // created scanner object
        System.out.print("Enter first no: ");       // prompting user to enter number
        int num1 = scanner.nextInt();
        System.out.print("Enter second no: ");      // prompting user to enter number
        int num2 = scanner.nextInt();
        System.out.print(" Eneter any symbol +, _, *,/ : ");  // prompting user to enter any symbol
        char symbol = scanner.next().charAt(0);

        switch (symbol)         //using switch statement
        {
            case '+' :
                System.out.println("Addition of"+ num1 + " and " + num2+"  =  " + (num1 + num2)); //concatination
                break;   // giving break so it will go out if the statement is true
            case '-':
                System.out.println("Deletion of "+ num1 + " and " + num2 +" = " + (num1 -num2)); // concatination
                break;   // giving break so it will go out if the statement is true
            case '*' :
                System.out.println("Multiplication of "+ num1 + " and " + num2 +" = " + (num1 * num2));
                break;   // giving break so it will go out if the statement is true
            case '/' :
                System.out.println("Devision of "+ num1 + " and " + num2 +" = "+ (num1 / num2));
                break ;   // giving break so it will go out if the statement is true
            default:
                    System.out.println("Invalid symbol Please select symbol from above :");
        }
    }
}
