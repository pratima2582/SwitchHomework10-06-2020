import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any Word: ");
        String sentence = scanner.nextLine();
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);
    }

    public static String reverse(String sentence)
    {
        if (sentence.isEmpty())
            return sentence;

        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}


