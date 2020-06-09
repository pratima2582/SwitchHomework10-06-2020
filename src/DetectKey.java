import java.util.Scanner;

public class DetectKey {
    public static void main(String[] args)          // main method
    {
        Scanner scanner = new Scanner(System.in);   // created scanner object
        System.out.print("Please Enter no from 0 to 9: ");       // prompting user to enter number
        int num = scanner.nextInt();

        switch (num) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7 : case 8: case 9:
                System.out.println("You have selected No:  " + num);    //printing out the result
                break;  // giving break so it will go out if the statement is true
            // there is another way to do it
            /*case 2:
                System.out.println("You have selected No:  " + num);  //printing out the result
                break;   // giving break so it will go out if the statement is true
            case 3:
                System.out.println("You have selected No:  " + num);   //printing out the result
                break;    // giving break so it will go out if the statement is true
            case 4:
                System.out.println("You have selected No:  " + num);
                break;    // giving break so it will go out if the statement is true
            case 5:
                System.out.println("You have selected No:  " + num);
                break;     // giving break so it will go out if the statement is true
            case 6:
                System.out.println("You have selected No:  " + num);
                break;     // giving break so it will go out if the statement is true
            case 7:
                System.out.println("You have selected No:  " + num);
                break;     // giving break so it will go out if the statement is true
            case 8:
                System.out.println("You have selected No:  " + num);
                break;     // giving break so it will go out if the statement is true
            case 9:
                System.out.println("You have selected No:  " + num);
                break;     // giving break so it will go out if the statement is true*/

            default:
                System.out.println("Not allowed - Please select no from 0 to 9 ");
        }
    }
}
