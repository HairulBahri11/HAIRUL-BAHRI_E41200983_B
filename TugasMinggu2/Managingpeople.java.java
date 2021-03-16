
package Managingpeople.java;
       
      public class Managingpeople { 
  
     public static void main(String[] args) {
        Orang object1 = new Orang();
        object1.set( "HAIRUL" , 19);
        
        Orang object2 = new Orang();
        object2.set("FAHMI", 18);
        
        if ( object1.ambilUmur() == object2.ambilUmur()){
            System.out.println(object1.ambilNama() + " umurnya sama dengan " + object2.ambilNama());
        }
        else {
            System.out.println(object1.ambilNama() + " umurnya berbeda dengan " + object2.ambilNama());
        }       
    }
}      
     class Orang{
         String Nama ;
         int Umur;
         
         public void set ( String Nama,int Umur){
             this.Nama = Nama;
             this.Umur = Umur;    
         }
         
       public String ambilNama(){
           return Nama;
       }
       public int ambilUmur(){
           return Umur;
       }
     }

        