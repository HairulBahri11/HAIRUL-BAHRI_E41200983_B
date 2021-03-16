
package Person.java;

public class orang {
    
    String nama, prodi, status;
    int umur;
    
     public orang( String nama, int umur, String prodi, String status){
        this.nama = nama;
        this.umur = umur;
        this.prodi = prodi;
        this.status = status;
    }
  
     public static void main(String[] args) {
 
     orang object = new orang ( "HAIRUL" , 19 ,"TIF", "AKTIF" );
         System.out.println(" Nama      = " + object.nama);
         System.out.println(" Umur      = " + object.umur);
         System.out.println(" Prodi     = " + object.prodi);
         System.out.println(" Status    = " + object.status);
         
         
         
         
    }
}
}

