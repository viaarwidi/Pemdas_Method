
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class rataRata {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;
        
        while (ulang) {
        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        double rataRata = hitungRataRata(array);

        System.out.println("Rata-rata bilangan adalah: " + rataRata);
        
        System.out.print("Apakah ingin mengulang? (ya/tidak): ");
            String jawaban = scanner.next().toLowerCase();
            ulang = jawaban.equals("ya");
        }
    }
    
    
    static double hitungRataRata(double[] arr) {
        double total = 0;

        for (double bilangan : arr) {
            total += bilangan;
        }

        return total / arr.length;
    }

}


