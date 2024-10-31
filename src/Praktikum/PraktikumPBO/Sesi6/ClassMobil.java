package Praktikum.PraktikumPBO.Sesi6;

// deklarasi class mobil
class mobil {
    // deklarasi variable/atribut
    String aktivitas;
    String warna;
    int kecepatan;

    mobil(String warna, int kecepatan) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        cekKecepatan(); // langsung panggil cekKecepatan untuk menetapkan aktivitas
    }

    // pembuatan method untuk cekKecepatan
    void cekKecepatan() {
        if (kecepatan==0) {
            aktivitas = "Parkir";
        }
        else {
            aktivitas = "Ngebuuuuuttttt";
        }
    }

    // pembuatan method untuk cetakAtribut
    void cetakAtribut() {
        System.out.println("Aktivitas = " + aktivitas);
        System.out.println("Warna = " + warna);
        System.out.println("Kecepatan = " + kecepatan);
    };
}

public class ClassMobil {
    public static void main(String[] args) {
        mobil mobilku = new mobil("Merah", 400);
        mobilku.kecepatan = 5000;
        mobilku.warna = "Merah";
        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
    }
}