package Praktikum.PraktikumPBO.Sesi13.PDF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class CopyElementsOfArrayListToVectorExample {
    public static void main(String[] args) {
        // Create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<>();
        // Add elements to ArrayList
        arrayList.add("1");
        arrayList.add("4");
        arrayList.add("2");
        arrayList.add("5");
        arrayList.add("3");

        // Create a Vector object
        Vector<String> v = new Vector<>();
        // Add elements to Vector
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F");
        v.add("G");
        v.add("H");

        System.out.println("Before copy, Vector Contains : " + v);

        // Ensure Vector has enough size to accommodate the ArrayList elements
        for (int i = v.size(); i < arrayList.size(); i++) {
            v.add(""); // Add empty strings to fill the Vector
        }

        // Copy all elements of ArrayList to Vector using Collections.copy() method
        Collections.copy(v, arrayList);

        System.out.println("After Copy, Vector Contains : " + v);
    }
}