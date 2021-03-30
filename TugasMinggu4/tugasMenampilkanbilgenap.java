
package wdsi;

import java.util.Scanner;

public class tugasMenampilkanbilgenap {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("MASUKKAN BATAS AWAL = ");
        int batasAwal = input.nextInt();
        System.out.print("MASUKKAN BATAS AKHIR = ");
        int batasAkhir = input.nextInt();

                System.out.println("Deret Bilangan Genap");
                for(int i=batasAwal;i<=batasAkhir;i++){
                    if (i%2==0)
                        System.out.print(i + " ");
                }
            }  
    }



