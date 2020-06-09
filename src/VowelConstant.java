import java.util.Scanner;

public class VowelConstant
{
    public static void main (String[] args) {

        Scanner scanner=new Scanner(System.in);            // Create scanner object
        System.out.print("Please enter any letter : ");// Prompting user to enter English marks
        char let = scanner.next().charAt(0);

        switch (let)
        {
            case 'a':  case 'e':  case 'i':  case 'o':  case 'u':
            case 'A':  case 'E':  case 'I':  case 'O':  case 'U':
                System.out.println(let +" Is Vowel"); // concatination
                break;

                default:                                    //giving default value
                System.out.println( let +" is Constant");
        }
    }
}
