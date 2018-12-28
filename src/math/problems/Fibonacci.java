package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        System.out.println("The Fibonacci number is " + F(40));
    }
        public static int F(int n) {
            if(n == 0) {
                return 0;
            }
            if(n == 1) {
                return 1;
            }
            else {
                //Fibonacci Sequence Function
                return F(n-1) + F(n-2);
            }

        }

    }

