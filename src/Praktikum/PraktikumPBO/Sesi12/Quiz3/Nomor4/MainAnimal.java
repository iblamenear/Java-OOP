package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor4;

public class MainAnimal {
    public static void main(String[] args) {
        // Membuat objek Mamalia
        Mamalia mamalia = new Mamalia("Kucing");
        mamalia.setUkuran(4);
        mamalia.setSifat("Jinak");
        mamalia.setJenisMamalia("Karnivora");
        mamalia.setJumlahKaki(4);
        mamalia.setBisaJalan(true);

        System.out.println("Mamalia:");
        System.out.println("Nama: " + mamalia.getNama());
        System.out.println("Ukuran: " + mamalia.getUkuran());
        System.out.println("Sifat: " + mamalia.getSifat());
        System.out.println("Jenis: " + mamalia.getJenisMamalia());
        System.out.println("Jumlah Kaki: " + mamalia.getJumlahKaki());
        System.out.println("Bisa Jalan: " + mamalia.getBisaJalan());

        // Membuat objek Aves
        Aves aves = new Aves("Burung Hantu", 2);
        aves.setSifat("Misterius");
        aves.setJenisAves("Nocturnal");
        aves.setBisaTerbang(true);

        System.out.println("\nAves:");
        System.out.println("Nama: " + aves.getNama());
        System.out.println("Ukuran: " + aves.getUkuran());
        System.out.println("Sifat: " + aves.getSifat());
        System.out.println("Jenis: " + aves.getJenisAves());
        System.out.println("Bisa Terbang: " + aves.getBisaTerbang());

        // Membuat objek Ayam
        Ayam ayam = new Ayam("Ayam Bangkok", 3);
        ayam.setSifat("Agresif");
        ayam.setJenisAyam("Petarung");
        ayam.setBisaDiadu(true);

        System.out.println("\nAyam:");
        System.out.println("Nama: " + ayam.getNama());
        System.out.println("Ukuran: " + ayam.getUkuran());
        System.out.println("Sifat: " + ayam.getSifat());
        System.out.println("Jenis: " + ayam.getJenisAyam());
        System.out.println("Bisa Diadu: " + ayam.getBisaDiadu());

        // Membuat objek Merpati
        Merpati merpati = new Merpati("Merpati Putih", 1);
        merpati.setSifat("Damai");
        merpati.setBisaTerbang(true);

        System.out.println("\nMerpati:");
        System.out.println("Nama: " + merpati.getNama());
        System.out.println("Ukuran: " + merpati.getUkuran());
        System.out.println("Sifat: " + merpati.getSifat());
        System.out.println("Bisa Terbang: " + merpati.getBisaTerbang());

        // Menggunakan kelas final
        Final finalClass = new Final();
        System.out.println("\nFinal Class Example:");
        finalClass.printMessage();
    }
}