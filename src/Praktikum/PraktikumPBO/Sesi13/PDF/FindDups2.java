package Praktikum.PraktikumPBO.Sesi13.PDF;

import java.util.HashSet;

public class FindDups2 {
    public static void main(String[] args) {
    HashSet<String> uniques = new HashSet<String>();
    HashSet<String> dups = new HashSet<String>();
    for (String a : args)
    if (!uniques.add(a))
    dups.add(a);
    // Destructive set-difference
    uniques.removeAll(dups);
    System.out.println("Unique words: " + uniques);
    System.out.println("Duplicate words: " + dups);
    }
    }