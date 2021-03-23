
package tugasswitchcase;

import java.util.Scanner;

public class Tugasswitchcase {

   
    public static void main(String[] args) {
        
        System.out.println("                       CAFE CERIA                           ");
        System.out.println("                      ANEKA MINUMAN                     ");
        System.out.println("------------------------------------------------------------");
        System.out.println("                       SPESIAL MENU  :                    ");
        System.out.println("                    1.      Soft drinks                    ");
        System.out.println("                    2.      Mix juice                       ");
        System.out.println("                    3.      Nescafe                         ");
        System.out.println("                    4.      Soda milk                      ");
        System.out.println("                    5.      Tea                               ");
        System.out.println("------------------------------------------------------------");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Pembeli : ");
        String pembeli = input.nextLine();
        System.out.println(" ");
        
        String[] menu = new String[5];
        menu[0] = "Soft drinks";
        menu[1] = "Mix juice";
        menu[2] = "Nescafe";
        menu[3] = "Soda milk";
        menu[4] = "Tea";
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        int noMenu = input.nextInt();
        switch (noMenu  ){
            case 1 -> {
                System.out.println("Minuman yang anda pesan adalah " + menu[0] );
                System.out.println("Pesanan akan segera kami antar");
            }
            case 2 -> {
                System.out.println("Minuman yang anda pesan adalah " + menu[1] );
                System.out.println("Pesanan akan segera kami antar");
            }
            case 3 -> {
                System.out.println("Minuman yang anda pesan adalah " + menu[2] );
                System.out.println("Pesanan akan segera kami antar");
            }
           case 4 -> {
               System.out.println("Minuman yang anda pesan adalah " + menu[3] );
               System.out.println("Pesanan akan segera kami antar");
            }
           case 5 -> {
               System.out.println("Minuman yang anda pesan adalah " + menu[4] );
               System.out.println("Pesanan akan segera kami antar");
            }
           default -> System.out.println(" Menu yang anda pesan tidak ada ");
        }
       
        System.out.println("Terimakasih " + pembeli + " telah berkunjung di Cafe Ceria ");
        
        
    }
    
    
}
