package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Overriding;

public class Ellips extends Bentuk {
    protected void gambar() {
        System.out.println("subclasss -> Menggambar Ellips");
    }

    protected void hapus() {
        System.out.println("subclasss -> Menghapus Gambar Ellips");
    }
}
