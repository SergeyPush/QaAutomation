package Lesson2;

class Fibonacci {


    private int a = 0;
    private int b = 1;


    void printFibonacciNumbers(int number) {

        System.out.println("Lesson2.Fibonacci numbers:");

        for (int c = 0; number > 0; number--) {


            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;

        }

        System.out.println();
    }

}
