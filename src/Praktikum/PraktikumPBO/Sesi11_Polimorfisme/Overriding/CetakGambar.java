package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Overriding;

public class CetakGambar extends Bentuk {
    private void tampil(Bentuk[] obj) {
        // Polimorfisme
        // Memanggil method yang sama yaitu method gambar() dan hapus()
        // Pada masing-masing ckass
        for (int i=0;i<obj.length;i++) {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("=====================");
        }
    }

    public static void main(String[] args) {
        Bentuk[] obj = {
            new Lingkaran(),
            new Ellips(),
            new Segitiga()
        };
        CetakGambar cetak = new CetakGambar();

        // Menampilkan method gambar() & hapus() pada class Bentuk (superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("=====================");

        // Overriding
        // Menumpuk method gambar() & hapus() pada class Bentuk (superclass)
        // dengan method gambar() & hapus() pada subclass-nya
        // yaitu class Lingkaran, Ellips, dan Segitiga
        cetak.tampil(obj);
    }
}
