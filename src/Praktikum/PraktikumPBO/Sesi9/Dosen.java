package Praktikum.PraktikumPBO.Sesi9;
import java.time.*;

public class Dosen extends Pegawai {
    // Atribut tambahan untuk dosen
    String nidn;

    // Constructor
    Dosen(String id, String nama, int gol, LocalDate tglLahir, String nidn) {
        super (id, nama, gol, tglLahir);
        this.nidn = nidn;
    }

    // Menghitung tunjangan pegawai dosen
    int hitungTunjPegawai() {
        int tunjPegawai = 1500000;
        return tunjPegawai;
    }

    // Menghitung tunjangan fungsional dosen
    int hitungTunjFungsional() {
        int tunjFungsional;
        if (this.hitungUsia() < 40) {
            tunjFungsional = 1700000;
        } else {
            tunjFungsional = 2000000;
        }
        return tunjFungsional;
    }

    // Menghitung total gaji
    int hitungTotalGaji() {
        int total = this.hitungGapok() + this.hitungTunjPegawai() + this.hitungTunjFungsional();
        return total;
    }

    // Cetak data pegawai, rincian gaji, total gaji
    void printPegawai() {
        System.out.println("ID Pegawai : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan : " + this.gol);
        System.out.println("Tgl Lahir : " + this.tglLahir);
        System.out.println("NIDN : " + this.nidn);
        System.out.println("Usia : " + this.hitungUsia() + "tahun");
        System.out.println("Gaji Pokok : " + this.hitungGapok());
        System.out.println("Tunj Pegawai : Rp " + this.hitungTunjPegawai());
        System.out.println("Tunj Fungsional : Rp " + this.hitungTunjFungsional());
        System.out.println("Total Gaji : Rp " + this.hitungTotalGaji());
        System.out.println();
    }
}
