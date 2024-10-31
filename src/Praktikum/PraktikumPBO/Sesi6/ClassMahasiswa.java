package Praktikum.PraktikumPBO.Sesi6;

class Mahasiswa {
    // atribut (variable instance)
    private String nama;
    private int umur;
    private String jurusan;

    // constructor (untuk menginisialisasi atribut)
    public Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    // method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
        System.out.println("Jurusan: " + this.jurusan);
    }

    // method getter untuk mengubah nama mahasiswa
    public void getNama(String nama) {
        this.nama = nama;
    }

    // method setter untuk mengubah nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // method getter untuk mengambil umur mahasiswa
    public int getUmur() {
        return umur;
    }

    // method setter untuk mengubah umur mahasiswa
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // method getter untuk mengambil jurusan mahasiswa
    public String getJurusan() {
        return jurusan;
    }

    // method setter untuk mengubah jurusan mahasiswa
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}

public class ClassMahasiswa {
    public static void main(String[] args) {
        // instansiasi objek mahasiswa dengan menggunakan konstruktor
        Mahasiswa mhs1 = new Mahasiswa("Andi", 20, "Teknik Informatika");

        // menampilkan informasi mahasiswa
        mhs1.tampilkanInfo();

        // mengubah nama dan umur menggunakan setter
        mhs1.setNama("Ucup");
        mhs1.setUmur(21);
        mhs1.setJurusan("Sistem Informasi");

        // menampilkan kembali informasi setelah diubah
        System.out.println("\nSetelah diubah: ");
        mhs1.tampilkanInfo();
    }
}