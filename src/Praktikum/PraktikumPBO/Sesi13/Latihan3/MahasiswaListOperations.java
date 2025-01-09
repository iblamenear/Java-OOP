package Praktikum.PraktikumPBO.Sesi13.Latihan3;

import java.util.*;

class Mahasiswa implements Comparable<Mahasiswa> {
    private String nrp;
    private String nama;

    // Constructor
    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    // Getter untuk NRP dan Nama
    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    // Implementasi metode compareTo untuk pengurutan berdasarkan nama
    @Override
    public int compareTo(Mahasiswa other) {
        return this.nama.compareTo(other.getNama()); // Urutkan berdasarkan nama
    }

    // Override toString untuk menampilkan data Mahasiswa dengan format yang jelas
    @Override
    public String toString() {
        return "NRP: " + nrp + ", Nama: " + nama;
    }
}

public class MahasiswaListOperations {
    public static void main(String[] args) {
        // Buat objek List dengan tipe Mahasiswa
        List<Mahasiswa> list = new ArrayList<>();

        // Tambahkan objek Mahasiswa ke dalam list
        list.add(new Mahasiswa("12345", "Andi"));
        list.add(new Mahasiswa("23456", "Budi"));
        list.add(new Mahasiswa("34567", "Charlie"));
        list.add(new Mahasiswa("45678", "Diana"));
        list.add(new Mahasiswa("56789", "Eva"));

        // Tampilkan data yang terdapat pada list
        System.out.println("Data pada list:");
        for (Mahasiswa mhs : list) {
            System.out.println(mhs);
        }

        // Balik data yang terdapat pada list dan tampilkan
        List<Mahasiswa> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        System.out.println("\nData setelah dibalik:");
        for (Mahasiswa mhs : reversedList) {
            System.out.println(mhs);
        }

        // Acak data tersebut dan tampilkan
        List<Mahasiswa> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("\nData setelah diacak:");
        for (Mahasiswa mhs : shuffledList) {
            System.out.println(mhs);
        }

        // Urutkan data berdasarkan nama dan tampilkan
        Collections.sort(list);
        System.out.println("\nData setelah diurutkan berdasarkan nama:");
        for (Mahasiswa mhs : list) {
            System.out.println(mhs);
        }
    }
}
