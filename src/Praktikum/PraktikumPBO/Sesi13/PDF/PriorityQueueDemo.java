package Praktikum.PraktikumPBO.Sesi13.PDF;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Buat PriorityQueue dengan tipe data String
        PriorityQueue<String> stringQueue = new PriorityQueue<>();

        // Tambahkan elemen ke PriorityQueue
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");

        // Jangan gunakan iterator karena mungkin tidak menunjukkan urutan PriorityQueue
        while (stringQueue.size() > 0) {
            System.out.println(stringQueue.remove());
        }
    }
}