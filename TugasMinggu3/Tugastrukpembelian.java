
package tugastrukpembelian;

import java.util.Scanner;


public class Tugastrukpembelian {


    public static void main(String[] args) {
        
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t \t \t  " +"Kharisma Agung Plaza < KAP >" );
        System.out.println("\t \t \t     " + "Promo Belanja Berhadiah");
        System.out.println("\t \t \t " + "Khusus Pembelian 5 Barang Pertama");
        System.out.println("\t \t \t " + "Dengan Harga Minimum Rp 10000,00");
        System.out.println("-----------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        
        String pembeli;
        System.out.print("Masukkan Nama Pembeli" + "\t\t" + " : ");
        pembeli = input.nextLine();
        System.out.println(" ");
        
         int[] harga = new int[5];

        for ( int j =  1; j<6; j++){
            if ( j ==1 ){
                System.out.print("Masukkan Harga Barang Ke-" + j + "\t" + " : ");
                harga[0] = input.nextInt();
            }
            else if ( j == 2){
               System.out.print("Masukkan Harga Barang Ke-" + j + "\t" + " : ");
               harga[1] = input.nextInt();
            }
            else if ( j == 3){
                System.out.print("Masukkan Harga Barang Ke-" + j + "\t" + " : ");
               harga[2] = input.nextInt();
            }
            else if ( j == 4){
                System.out.print("Masukkan Harga Barang Ke-" + j + "\t" + " : ");
               harga[3] = input.nextInt();
        }
            else {
                System.out.print("Masukkan Harga Barang Ke-" + j + "\t" + " : ");
               harga[4] = input.nextInt();
        }
        }
        
       int  totalHarga = harga[0] + harga [1] + harga[2] + harga[3] + harga[4];
       System.out.println("Total Harga Pembelian atas nama " + pembeli + " adalah Rp " + totalHarga);
       
       if (harga[0] >= 10000 && harga[1] >= 10000 && harga[2] >= 10000 && harga[3] >= 10000 && harga[0] >= 10000){
           if ( totalHarga >= 50000 && totalHarga < 75000 ){
               System.out.println(" ");
               System.out.println("Selamat . . . . . . . . . . . . . .");
               System.out.println(" Anda mendapat hadiah 1 buah wafer tanggo");
           }
           else if (totalHarga >= 75000 && totalHarga < 100000){
               System.out.println(" ");
               System.out.println("Selamat . . . . . . . . . . . . . .");
               System.out.println(" Anda mendapat hadiah 1 buah piring plastik");
           }
           else if ( totalHarga >= 100000 ){
               System.out.println(" ");
               System.out.println("Selamat . . . . . . . . . . . . . .");
               System.out.println("Anda mendapat hadiah 1 buah mug cantik");
           }
           
       }
       
       else {
           System.out.println(" ");
           System.out.println(" ");
       }
       
       System.out.println("----------------------------------------------------------------------------");
       System.out.println("\t\t\t\t" + " Terima Kasih ");
        System.out.println("\t\t   " + " Anda sudah belanja di Kharisma Agung Plaza");
            
            
    }
}
    

