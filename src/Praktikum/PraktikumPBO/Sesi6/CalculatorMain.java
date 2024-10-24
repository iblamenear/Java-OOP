package Praktikum.PraktikumPBO.Sesi6;

class calculator {
    // atribut (operan1 dan operan2)
    public double operan1;
    public double operan2;

    // method untuk mensetting operan1
    public void isiOperan1(double x) {
        this.operan1 = x;
    }

    // method untuk mensetting operan2
    public void isiOperan2(double x) {
        this.operan2 = x;
    }

    // method untuk menjumlahkan operan1 dan operan2
    public double tambah() {
        return operan1 + operan2;
    }

    // method untuk mengurangi operan1 dan operan2
    public double kurang() {
        return operan1 - operan2;
    }

    // method untuk mengalikan operan1 dan operan2
    public double kali() {
        return operan1 * operan2;
    }

    // method untuk membagi operan1 dan operan2
    public double bagi() {
        if (operan2 != 0){
            return operan1 / operan2;
        } else{
            System.out.println("Error: Tidak Bisa Membagi dengan Nol");
            return Double.NaN; // Return NaN (Not a Number) for division by zero
        }
    }

    // Method untuk menghitung pangkat
    public double pangkat() {
        return Math.pow(operan1, operan2);
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        calculator calc = new calculator();
        // Setting nilai
        calc.isiOperan1(10.0);
        calc.isiOperan2(4.0);
        // Menampilkan hasil
        System.out.println("Operan1 + Operan2" + calc.tambah());
        System.out.println("Operan1 - Operan2" + calc.kurang());
        System.out.println("Operan1 * Operan2" + calc.kali());
        System.out.println("Operan1 / Operan2" + calc.bagi());
        System.out.println("Operan1 ^ Operan2" + calc.pangkat());
    }
}
