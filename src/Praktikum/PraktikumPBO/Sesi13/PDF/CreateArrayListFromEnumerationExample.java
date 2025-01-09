package Praktikum.PraktikumPBO.Sesi13.PDF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CreateArrayListFromEnumerationExample {
    public static void main(String[] args) {
    //create a Vector object
    Vector<String> v = new Vector<String>();
    //Add elements to Vector
    v.add("A");
    v.add("B");
    v.add("D");
    v.add("E");
    v.add("F");
    System.out.println("Vector contains : " + v);
    //Get Enumeration over Vector
    Enumeration e = v.elements();
    //Create ArrayList from Enumeration of Vector
    ArrayList aList = Collections.list(e);
    System.out.println("Arraylist contains : " + aList);
    }
    }