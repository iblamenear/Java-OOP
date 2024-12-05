package Praktikum.PraktikumPBO.Sesi9;
import java.time.*;

public class ProjectSiakad {
    public static void main(String[] args) {
        // Contoh obyek data pegawai
        Pegawai p1 = new Pegawai("P01", "Arman", 2, LocalDate.of(1979, 9,1));
        p1.printPegawai();

        // Contoh obyek data pegawai dosen
        Dosen p2 = new Dosen("P02", "Fitri", 1, LocalDate.of(1979, 9, 17), "8888");
        p2.printPegawai();

        //contoh obyek data pegawai nondosen
        NonDosen p3 = new NonDosen("P03", "Farida", 1, LocalDate.of(2008,1,25));
        p3.printPegawai();
    }    
}
