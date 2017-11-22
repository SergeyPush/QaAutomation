package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainArray {

    public static void main(String[] args) {

        // Create Array add items
        ArrayList <String> myarray = new ArrayList<>();

        myarray.add("Bill");
        myarray.add("John");
        myarray.add("Joshua");
        myarray.add("Alister");
        myarray.add("Kevin");
        myarray.add("Ann");

        // Print array
        System.out.println("Created Array:");
        for (String item: myarray) {
            System.out.print (item +" ");
        }

        // Delete item from array
        myarray.remove("Joshua");

        // Check if item is deleted
        String mesage = myarray.contains("Joshua")? "\nArray contains deleted object" : "\nObject is deleted";
        System.out.println("\n"+mesage);

        // Print unsorted array
        System.out.println("\nBefore sorting:");
        for (String iterate: myarray){
            System.out.print (iterate + " ");
        }

        // Sort array
        Collections.sort(myarray);

        // Iterate sorted array
        System.out.println("\n\nAfter sorting:");
        Iterator <String> iterator = myarray.iterator();
        while (iterator.hasNext()){
            System.out.print (iterator.next()+" ");
        }






    }
}
