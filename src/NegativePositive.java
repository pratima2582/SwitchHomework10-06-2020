import java.util.Scanner;

public class NegativePositive
{
      public static int value(int num)
{

    if (num>0)
    {
        return 1;
    }
        else if (num<0)
    {
        return 0;
    }
        else
    {
        return -1;
    }
}
    public static void main(String[] args)    // Main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no : ");
        int num = scanner.nextInt();
         int a = value(num);
       switch (a)
       {

           case 0:{
               System.out.println("Nagetive");}

              break;
           case 1:
               System.out.println("positive");
               break;
           default:
               System.out.println("No is zero");
       }

    }
}
