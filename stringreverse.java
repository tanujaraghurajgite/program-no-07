//PROGRAM NO:7 write a java program to reverse the letter prents in the given string 
import java.util.Scanner;
public class stringreverse
{

    public static void main(String[] args) 
	{
        String str;
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
       
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
       
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}