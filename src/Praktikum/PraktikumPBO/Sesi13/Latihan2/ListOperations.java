package Praktikum.PraktikumPBO.Sesi13.Latihan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Buat objek List dengan data bertipe String
        List<String> list = new ArrayList<>();

        // Tambahkan data ke dalam list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Tampilkan data yang terdapat pada list
        System.out.println("Data pada list: " + list);

        // Balik data yang terdapat pada list dan tampilkan
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        System.out.println("Data setelah dibalik: " + reversedList);

        // Acak data tersebut dan tampilkan
        List<String> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("Data setelah diacak: " + shuffledList);

        // Urutkan data tersebut dan tampilkan
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println("Data setelah diurutkan: " + sortedList);
    }
}