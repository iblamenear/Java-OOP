package Praktikum.PraktikumPBO.Sesi8;

public class Manager extends Pegawai {
    @Override
    public void menampilkan() {
        // Untuk nilai dari void menampilkan bisa berbeda dari nilai yang ada pada superclass
        System.out.println("Nama        : " + nama);
        System.out.println("Id Pegawai  : " + id_pegawai);
        System.out.println("Gaji        : " + gaji);
    }

    // Untuk fungsi dari void tugas() merupakan fungsi spesifik yang hanya dimiliki
    // oleh class manager.
    public void tugas() {
        System.out.println("Tugas       : Melakukan manajemen untuk franchise");
        System.out.println("===================================================");
    }
}
