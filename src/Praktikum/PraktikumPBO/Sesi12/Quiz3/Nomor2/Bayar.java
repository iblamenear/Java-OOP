package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor2;

public class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    // Konstruktor default
    public Bayar() {}

    // Konstruktor dengan parameter ID
    public Bayar(int id) {
        setData(); // Mengatur data dari Gojek
        this.nama = "Andre Budiman";
        this.jarak = 10; // Contoh jarak
        this.total = jarak * 5000; // Total biaya dihitung dari jarak
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total Bayar: Rp " + total);
    }

    @Override
    public void setData() {
        super.setData(); // Memanggil setData dari Gojek
        this.nama = "Andre Budiman";
        this.jarak = 0;
        this.total = 0;
    }

    @Override
    public int getId() {
        return super.getId();
    }
}