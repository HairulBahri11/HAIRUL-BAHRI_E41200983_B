
package wdsi;


public class tugasKelipatan2 {
    
    public static void main(String[] args) {
        System.out.println("              Do_While               ");
        System.out.println("    Bilangan kelipatan 2 ( 1-100)");
        System.out.println("======================================");
        
 int angkaAwal = 1;
 int batasAkhir =100;
   do {
       System.out.print(angkaAwal);
       angkaAwal= angkaAwal * 2;
       System.out.print("    ");
   } while( angkaAwal<=batasAkhir);
    }
    
}
