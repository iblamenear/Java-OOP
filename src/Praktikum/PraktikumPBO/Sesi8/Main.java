package Praktikum.PraktikumPBO.Sesi8;

public class Main {
    public static void main(String[] args) throws Exception {
        Pegawai Pegawai = new Pegawai();
        Manager Manager = new Manager();
        Kasir Kasir = new Kasir();
        Pelayan Pelayan = new Pelayan();
        Satpam Satpam = new Satpam();

        Manager.nama = "Sifa";
        Manager.id_pegawai = 1;
        Manager.gaji = "7 Juta";

        Kasir.nama = "Aldi";
        Kasir.id_pegawai = 2;
        Kasir.gaji = "1,2 Juta";

        Pelayan.nama = "Dean";
        Pelayan.id_pegawai = 4;
        Pelayan.gaji = "1,2 Juta";

        Satpam.nama = "Aldi";
        Satpam.id_pegawai = 2;
        Satpam.gaji = "1 Juta";

        Manager.menampilkan();
        Manager.tugas();

        Kasir.menampilkan();
        Kasir.tugas();

        Pelayan.menampilkan();
        Pelayan.tugas();

        Satpam.menampilkan();
        Satpam.tugas();
    }
}