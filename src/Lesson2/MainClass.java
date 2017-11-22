package Lesson2;

public class MainClass {

    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();

        f.printFibonacciNumbers(21);

        System.out.println("---------------//-----------");



        Person bill = new Person("Bill", 28, "male");
        Person john = new Person("John", 31, "male");


        System.out.println(john);
        System.out.println(bill);


        System.out.println(bill.hashCode());
        System.out.println(john.hashCode());

        System.out.println(john.equals(bill));

        String string = "Test string";
        System.out.println(string.equals("Test string"));





    }
}
