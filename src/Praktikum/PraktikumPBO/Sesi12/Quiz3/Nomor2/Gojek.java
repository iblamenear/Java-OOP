package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor2;

public class Gojek implements Transportasi {
    private int harga;
    private int id;

    @Override
    public void tampil() {
        System.out.println("ID: " + id);
        System.out.println("Harga: " + harga);
    }

    @Override
    public void setData() {
        // Contoh pengisian data
        this.id = 1;
        this.harga = 20000;
    }

    @Override
    public int getId() {
        return this.id;
    }
}