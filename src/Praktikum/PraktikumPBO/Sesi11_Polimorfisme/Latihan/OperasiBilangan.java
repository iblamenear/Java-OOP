package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Latihan;

// Class OperasiBilangan
abstract class OperasiBilangan {
    protected double a, b, c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected abstract void set_C();

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected abstract void tampil();
}