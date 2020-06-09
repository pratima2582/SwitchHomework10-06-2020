import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args)    // Main method
    {
        Scanner scanner = new Scanner(System.in);    // Scanner object to get input in console
        System.out.print("Please enter any No to check if its Odd or Even : "); //Prompting user to enter any no
        int num = scanner.nextInt();  //datatype int input
        switch (num % 2 )    // giving % condition to get result
        {
            case 0:           //if the result is 0 then its a even no
                System.out.println( num + " is Even No");  //concatination
            break;

            case 1:          // if the result is reminding value then its a odd no
                System.out.println(num + " is Odd No");   // concatination
        }
    }

}
