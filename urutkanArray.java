/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class urutkanArray {

    
    static void mengurutkanArray(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] angkaArray = {8.1, 7.3, 2.1};

        System.out.println("Array sebelum diurutkan:");
        for (double angka : angkaArray) {
            System.out.print(angka + " ");
        }
        System.out.println();

        mengurutkanArray(angkaArray);

        System.out.println("Array setelah diurutkan:");
        for (double angka : angkaArray) {
            System.out.print(angka + " ");
        }
    }
}

