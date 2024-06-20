
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class live_Code_Method {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner (System.in);
//        int number=scan.nextInt();
//        
//         if (isPalindrome(number)) {
//            System.out.println("Bilangan tersebut merupakan bilangan palindrome");
//        } else {
//            System.out.println("Bilangan tersebut bukan bilangan palindrome");
//        }
//    }
//    
//     public static int reverse(int number) {
//        int revnum = 0;
//
//        while (number > 0) {
//            int digit = number % 10;
//            revnum = revnum * 10 + digit;
//            number /= 10;
//        }
//
//        return revnum;
//    }
//     
//    public static boolean isPalindrome(int number){
//        int revnum=reverse(number);
//        return number ==revnum;
//        
//    }
    
         public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        int angka1 = scan.nextInt();
        int angka2 = scan.nextInt();
        int angka3 = scan.nextInt();

        displaySortedNumber(angka1,angka2,angka3);
    }
  
  	public static void displaySortedNumber(int angka1, int angka2, int angka3) {
        int sort;
        
        if (angka1 > angka2) {
            sort = angka1;
            angka1 = angka2;
            angka1 = sort;
        }

        if (angka2 > angka3) {
            sort = angka2;
            angka2 = angka3;
            angka3 = sort;
        }

        if (angka1 > angka2) {
            sort = angka1;
            angka1 = angka2;
            angka2 = sort;
        }
 System.out.println(angka1 + " " + angka2 + " " + angka3);
    }
}
    
    
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int angka = scan.nextInt();
//        int hasil = sumDigits(angka);
//        System.out.println( hasil );
//    }
//  
//      public static int sumDigits(int angka) {
//       while (angka > 9) 
//       {
//            int jumlah = 0;
//            while (angka !=  0) 
//            {
//            jumlah += angka % 10;
//            angka /= 10;
//            }
//            angka = jumlah;
//        }
//        return angka;
//    }
//    
//}

