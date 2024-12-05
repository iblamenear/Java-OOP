package Praktikum.PraktikumPBO.Sesi9;
import java.time.*;

public class Pegawai {
    // Atribut
    String idPegawai;
    String nama;
    int gol;
    LocalDate tglLahir;

    // Constructor
    Pegawai(String id, String nama, int gol, LocalDate tglLhr) {
        this.idPegawai = id;
        this.nama = nama;
        this.gol = gol;
        this.tglLahir = tglLhr;
    }

    // Method untuk menghitung usia pegawai
    int hitungUsia() {
        // Mendapatkan tanggal hari ini
        LocalDate today = LocalDate.now();
        // Hitung selisih tgl lahir dan tgl hari ini
        Period selisih = Period.between(this.tglLahir, today);
        return selisih.getYears();
    }

    // Hitung gaji pokok berdasarkan golongan dan usia
    int hitungGapok() {
        int gapok = 0;
        if (this.gol == 1) {
            if (this.hitungUsia() < 40) {
                gapok = 3500000;
            } else {
                gapok = 4500000;
            }
        } else if (this.gol == 2) {
            if (this.hitungUsia() < 40) {
                gapok = 5000000;
            } else {
                gapok = 6000000;
            }
        }
        return gapok;
    }

    // Mencetak data pegawai dan gaji pokoknya
    void printPegawai() {
        System.out.println("ID Pegawai : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan : " + this.gol);
        System.out.println("Tgl Lahir : " + this.tglLahir);
        System.out.println("Gaji Pokok : Rp " +this.hitungGapok());
        System.out.println();
    }
}
