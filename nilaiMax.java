
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class nilaiMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.print("Masukkan jumlah angka: ");
            int n = scanner.nextInt();

            double[] angkaArray = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                angkaArray[i] = scanner.nextDouble();
            }

            double nilaiMax = nilaiMax(angkaArray);

            System.out.println("Nilai maksimum adalah: " + nilaiMax);

            System.out.print("Apakah ingin mengulang? (ya/tidak): ");
            String jawaban = scanner.next().toLowerCase();
            ulang = jawaban.equals("ya");
        }
 
    }
    
    static double nilaiMax(double[] arr) {
        double max = arr[0];

        for (double angka : arr) {
            if (angka > max) {
                max = angka;
            }
        }
        return max;
    }
}


