package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Latihan;

// Class OperasiBilanganCetak
class OperasiBilanganCetak {
    public void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C();
            operasi.tampil();
        }
    }
}