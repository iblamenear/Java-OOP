package Praktikum.PraktikumPBO.Sesi13.Tugas1;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Buat objek List warna (ArrayList)
        List<String> warna = new ArrayList<>();
        warna.add("MAGENTA");
        warna.add("RED");
        warna.add("WHITE");
        warna.add("BLUE");
        warna.add("CYAN");

        // Buat objek List warnaDihapus (ArrayList)
        List<String> warnaDihapus = new ArrayList<>();
        warnaDihapus.add("RED");
        warnaDihapus.add("WHITE");
        warnaDihapus.add("BLUE");

        // Hapus data yang ada pada warnaDihapus dari warna
        warna.removeAll(warnaDihapus);

        // Tampilkan hasilnya
        System.out.println("Warna setelah penghapusan:");
        System.out.println(warna);
    }
}
