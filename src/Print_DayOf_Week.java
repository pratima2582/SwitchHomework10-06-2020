import java.util.Scanner;

public class Print_DayOf_Week
{
    public static void main(String[] args)          // main method
    {
        Scanner scanner = new Scanner(System.in);   // created scanner object
        System.out.print("Please Enter no from 0 to 9: ");       // prompting user to enter number
        int day_no = scanner.nextInt();

        switch (day_no)
        {
            case 1:
                System.out.println("Its Sunday:  ");    // by inputting any no to get days name accordingly
                break;  // giving break so it will go out if the statement is true
            case 2:
                System.out.println("Its Monday ");  // by inputting any no to get days name accordingly
                break;   // giving break so it will go out if the statement is true
            case 3:
                System.out.println("Its Tuesday ");   // by inputting any no to get days name accordingly
                break;    // giving break so it will go out if the statement is true
            case 4:
                System.out.println("Its Wednusday ");   // by inputting any no to get days name accordingly
                break;    // giving break so it will go out if the statement is true
            case 5:
                System.out.println("Its Thursday  ");    // by inputting any no to get days name accordingly
                break;     // giving break so it will go out if the statement is true
            case 6:
                System.out.println("Its Friday ");    // by inputting any no to get days name accordingly
                break;     // giving break so it will go out if the statement is true
            case 7:
                System.out.println("Its Saterday ");  // by inputting any no to get days name accordingly
                break;     // giving break so it will go out if the statement is true
            default:
                System.out.println("Invalid Choice - Please select no between 1 to 7 ");

        }
    }

}
