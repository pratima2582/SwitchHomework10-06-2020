import java.util.Scanner;

public class CityName
{
    public static void main(String[] args)    //main method
    {
        Scanner scanner = new Scanner(System.in);     //created scanner object
        System.out.print("Please enter Any Alphabets : ");//promting user to enter alphabet
        char city = scanner.next().charAt(0);
        switch (city)
        {
            case 'a':
                System.out.println("Acton ");    //printing out the result
                break;  // giving break so it will go out if the statement is true
            case 'b':
                System.out.println(" Bristol ");  //printing out the result
                break;   // giving break so it will go out if the statement is true
            case 'c' :
                System.out.println("Cambridge");   //printing out the result
                break;    // giving break so it will go out if the statement is true
            case 'd' :
                System.out.println("Devon");
                break;    // giving break so it will go out if the statement is true
            case 'e' :
                System.out.println("Edinburgh");
                break;     // giving break so it will go out if the statement is true
            case 'f' :
                System.out.println("Formbey");
                break;     // giving break so it will go out if the statement is true
            default:
                System.out.println("Invalid Entry");


        }


    }
}
