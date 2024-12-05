package Praktikum.PraktikumPBO.Sesi9;
import java.time.*;

public class NonDosen extends Pegawai{
    // Constructor
    NonDosen(String id, String nama, int gol, LocalDate tglLahir) {
        super(id, nama, gol, tglLahir);
    }

    // Menghitung tunjangan pegawai nondosen
    int hitungTunjPegawai() {
        int tunjPegawai = 1000000;
        return tunjPegawai;
    }

    // Menghitung total gaji
    int hitungTotalGaji() {
        int total = this.hitungGapok() + this.hitungTunjPegawai();
        return total;
    }

    // Cetak data pegawai, rincian gaji, total gaji
    void printPegawai() {
        System.out.println("ID Pegawai : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan : " + this.gol);
        System.out.println("Tgl Lahir : " + this.tglLahir);
        System.out.println("Usia : " + this.hitungUsia() + "tahun");
        System.out.println("Gaji Pokok : " + this.hitungGapok());
        System.out.println("Tunjangan Pegawai : " + this.hitungTunjPegawai());
        System.out.println("Total Gaji : " + this.hitungTotalGaji());
        System.out.println();
    }
}
