package Praktikum.PraktikumPBO.Sesi13.Tugas2;

import java.util.*;

class Mahasiswa {
    private String nrp;
    private String nama;
    private float nilai;

    // Constructor
    public Mahasiswa(String nrp, String nama, float nilai) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    // Getter untuk NRP, Nama, dan Nilai
    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    public float getNilai() {
        return nilai;
    }

    // Override toString untuk menampilkan data Mahasiswa
    @Override
    public String toString() {
        return "NRP: " + nrp + ", Nama: " + nama + ", Nilai: " + nilai;
    }
}

public class PengurutanMahasiswa {
    public static void main(String[] args) {
        // Queue untuk menyimpan data mahasiswa
        Queue<Mahasiswa> queue = new LinkedList<>();

        // Nama-nama mahasiswa dan NRP (disiapkan manual)
        String[] namaMahasiswa = {"Andi", "Budi", "Charlie", "Diana", "Eva", "Fahmi", "Gina", "Hadi", "Indra", "Joko"};
        String[] nrpMahasiswa = {"12345", "23456", "34567", "45678", "56789", "67890", "78901", "89012", "90123", "01234"};

        // Menambahkan data mahasiswa ke dalam queue dengan nilai acak
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            float nilai = 60 + random.nextFloat() * (100 - 60); // Nilai acak antara 60 dan 100
            queue.add(new Mahasiswa(nrpMahasiswa[i], namaMahasiswa[i], nilai));
        }

        // Tampilkan data mahasiswa sebelum diurutkan
        System.out.println("Data Mahasiswa Sebelum Diurutkan:");
        for (Mahasiswa mhs : queue) {
            System.out.println(mhs);
        }

        // Urutkan mahasiswa berdasarkan nilai menggunakan Comparator
        List<Mahasiswa> listMahasiswa = new ArrayList<>(queue);
        Collections.sort(listMahasiswa, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return Float.compare(m1.getNilai(), m2.getNilai()); // Urutkan berdasarkan nilai
            }
        });

        // Tampilkan data mahasiswa setelah diurutkan
        System.out.println("\nData Mahasiswa Setelah Diurutkan Berdasarkan Nilai:");
        for (Mahasiswa mhs : listMahasiswa) {
            System.out.println(mhs);
        }
    }
}
