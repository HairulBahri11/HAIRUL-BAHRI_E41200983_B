
package Minggu7_2;


public class mainTVModern {
    
    public static void main(String[] args) {
        
        TelevisiModern tv = new TelevisiModern("TV KONGUHAN , 12 inc" ,12);
        
       String [] semuaChannel = {"RCTI" , "SCTV", "INDOSIAR", "LA TV","METRO TV"
                                                ,"METRO TV", "TRANS TV", "TPI", "TV7", "TVRI"
                                                 ,"TV G", "AN TV"};

        System.out.println("Pak Lukman, membeli Televisi : " + tv.getDeskripsi());
       
        tv.getChannels();
        tv.setChannels(semuaChannel);
       
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        
        tv.setModusTampilan(TelevisiModern.TELETEXT);
       tv.setHalamanTeleText(250); 
        tv.setModusTampilan(TelevisiModern.tV);
       tv.playCD();
       tv.setDiscTray("OVJ");
       tv.playCD();
        
        
    }
                   
    
}
