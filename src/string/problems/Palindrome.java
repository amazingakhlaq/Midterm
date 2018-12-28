package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        //For capturing user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        /* If function returns true then the string is
         * palindrome else not
         */
        if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");

    }
    public static boolean isPal(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))

            return isPal(s.substring(1, s.length()-1));

        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        return false;
    }
}
