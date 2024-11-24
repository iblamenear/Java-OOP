package Praktikum.PraktikumPBO.Sesi8;

public class Kasir extends Pegawai {
    @Override
    public void menampilkan() {
        System.out.println("Nama        : " + nama);
        System.out.println("Id Pegawai  : " + id_pegawai);
        System.out.printf("Gaji  :", gaji); // Format gaji untuk dua angka dibelakang koma
    }

    public void tugas() {
        System.out.println("Tugas : Melakukan transaksi dengan pembeli");
        System.out.println("=================================================");
    }
}
