public class Fibonacci {


    int a = 0;
    int b = 1;


    public void printFibonacciNumbers(int number) {

        for (int c = 0; number > 0; number--) {


            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;

        }


    }

}
