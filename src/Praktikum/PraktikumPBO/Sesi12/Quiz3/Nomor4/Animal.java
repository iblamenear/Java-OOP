package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor4;

public abstract class Animal implements AnimalInterface {
    protected String nama;
    protected int ukuran;
    protected String sifat;

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public int getUkuran() {
        return ukuran;
    }

    @Override
    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    @Override
    public String getSifat() {
        return sifat;
    }
}