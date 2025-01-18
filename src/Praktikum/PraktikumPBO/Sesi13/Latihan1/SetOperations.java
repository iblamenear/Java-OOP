package Praktikum.PraktikumPBO.Sesi13.Latihan1;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        // Definisikan himpunan A dan B
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        // Tambahkan elemen ke dalam himpunan A
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        // Tambahkan elemen ke dalam himpunan B
        B.add(5);
        B.add(6);
        B.add(7);
        B.add(8);
        B.add(9);
        B.add(10);

        // A - B (difference)
        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println("A - B: " + difference);

        // A ∩ B (intersection)
        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("A ∩ B: " + intersection);

        // A ∪ B (union)
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("A U B: " + union);

        // A ⊆ B (subset check)
        boolean isSubset = B.containsAll(A);
        System.out.println("A ⊆ B: " + isSubset);
    }
}