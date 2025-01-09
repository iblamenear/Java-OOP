package Praktikum.PraktikumPBO.Sesi13.PDF;

import java.util.HashSet;

public class FindDups {
    public static void main(String[] args) {
    HashSet<String> s = new HashSet<String>();
    for (String a : args)
    if (!s.add(a))
    System.out.println("Duplicate detected: " + a);
    System.out.println(s.size() + " distinct words: " + s);
    }
    }