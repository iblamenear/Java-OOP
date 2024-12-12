package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Latihan;

// Main class
public class Main {
    public static void main(String[] args) {
        double A = 10.5;
        double B = 0.5;

        // Membuat array dari objek-objek operasi
        OperasiBilangan[] operasiBilangan = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        // Mencetak hasil semua operasi
        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        cetak.cetakSemua(operasiBilangan, A, B);
    }
}