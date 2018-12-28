package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int x;
        int input = 5;
        int result = 1;

        for (int i = 1; i <= input; i++) {
            result = result * i;
            System.out.println(result);


        }
            //recursion Factorial method call
            System.out.println(factorial(10));

        }


    public static int factorial ( int x){
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    }

