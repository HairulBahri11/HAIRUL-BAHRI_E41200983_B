
package Latihan_input;

import java.util.Scanner;

public class Latihan_input {
    
    public static void main(String[] args) {
        
        //buat Scanner
        Scanner s1 = new Scanner (System.in);
        
        //Ambil nilai (input) dari keyboard 
        System.out.println(" Masukkan Nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.println(" Masukkan Nilai2 = ");
        int nilai2 = s1.nextInt();
        
        //Hitung dan Print
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
    
    
}
