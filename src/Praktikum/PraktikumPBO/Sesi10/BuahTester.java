package Praktikum.PraktikumPBO.Sesi10;

class Buah {
    // Atribut
    private String nama;
    private String warna;

    // Konstruktor
    public Buah(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    // Metode umum untuk makan buah
    public void makan() {
        System.out.println("Memakan buah " + nama);
    }

    // Metode untuk menampilkan informasi buah
    public void tampilkanInfo() {
        System.out.println("Nama buah: " + nama);
        System.out.println("Warna buah: " + warna);
    }
}

// Subclass - Apel
class Apel extends Buah {
    // Konstruktor
    public Apel(String warna) {
        super("Apel", warna); // Memanggil konstruktor superclass Buah
    }

    // Metode khusus untuk apel
    public void kriuk() {
        System.out.println("Suara kriuk saat menggigit apel!");
    }
}

// Subclass - Pisang
class Pisang extends Buah {
    // Konstruktor
    public Pisang(String warna) {
        super("Pisang", warna); // Memanggil konstruktor superclass Buah
    }

    // Metode khusus untuk pisang
    public void kupas() {
        System.out.println("Mengupas pisang...");
    }
}

// Subclass - Jeruk
class Jeruk extends Buah {
    // Konstruktor
    public Jeruk(String warna) {
        super("Jeruk", warna); // Memanggil konstruktor superclass Buah
    }

    // Metode khusus untuk jeruk
    public void peras() {
        System.out.println("Memeras jeruk untuk membuat jus...");
    }
}

public class BuahTester {
    public static void main(String[] args) {
        // Membuat objek buah
        Buah buah1 = new Buah("Buah Umum", "Hijau");
        buah1.tampilkanInfo();
        buah1.makan();

        System.out.println();

        // Membuat objek apel
        Apel apel1 = new Apel("Merah");
        apel1.tampilkanInfo();
        apel1.makan();
        apel1.kriuk();

        System.out.println();

        // Membuat objek pisang
        Pisang pisang1 = new Pisang("Kuning");
        pisang1.tampilkanInfo();
        pisang1.makan();
        pisang1.kupas();

        System.out.println();

        // Membuat objek jeruk
        Jeruk jeruk1 = new Jeruk("Orange");
        jeruk1.tampilkanInfo();
        jeruk1.makan();
        jeruk1.peras();
    }
}
