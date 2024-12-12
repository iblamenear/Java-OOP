package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Latihan;

// Class OperasiPengurangan
class OperasiPengurangan extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a - b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pengurangan: " + c);
    }
}
