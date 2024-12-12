package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Latihan;

// Class OperasiPerkalian
class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a * b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Perkalian: " + c);
    }
}
