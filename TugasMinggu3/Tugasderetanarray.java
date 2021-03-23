
package tugasderetanarray;

import java.util.Scanner;

public class Tugasderetanarray {

    
    public static void main(String[] args) {
      
        Scanner inputData = new Scanner(System.in);
        int banyakDeret = 0;
        System.out.print("Masukkan Banyak Deret = ");
        banyakDeret = inputData.nextInt();
        
        int deret[] = new int[banyakDeret];
        
        for ( int b = 0; b < banyakDeret; b++){
            
            deret[b] = (int) (Math.random() * 10);
        }
        
             for(int k = 0; k<banyakDeret; k++){
             System.out.print(deret[k]+ "  ");
                 
        }
        }
    }
    
