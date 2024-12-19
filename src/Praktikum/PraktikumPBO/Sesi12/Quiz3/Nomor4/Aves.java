package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor4;

public class Aves extends Animal {
    private String jenisAves;
    private boolean bisaTerbang;

    public Aves() {}

    public Aves(String nama, int ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }

    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public boolean getBisaTerbang() {
        return bisaTerbang;
    }
}