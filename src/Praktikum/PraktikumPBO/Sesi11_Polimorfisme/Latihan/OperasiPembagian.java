package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Latihan;

// Class OperasiPembagian
class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_C() {
        if (b != 0) {
            c = a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
        }
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pembagian: " + c);
    }
}