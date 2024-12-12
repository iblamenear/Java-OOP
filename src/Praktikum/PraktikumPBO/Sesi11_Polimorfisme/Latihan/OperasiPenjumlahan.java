package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Latihan;

// Class OperasiPenjumlahan
class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a + b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Penjumlahan: " + c);
    }
}
