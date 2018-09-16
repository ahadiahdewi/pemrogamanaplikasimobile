/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan.tugas2;

/**
 *
 * @author AHADIAH
 */
public class PercabanganTugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int nilaiAndroid = 85;
    String wajah ="Ganteng";
    String asal ="Malang";
        
    System.out.println("Apakah mau menikah ?");
    String nilaiAndroidHuruf;
    
    if (nilaiAndroid >=85){
        nilaiAndroidHuruf ="A";
    }
    else if (nilaiAndroid >=75){
        nilaiAndroidHuruf ="B";
    }
    else if (nilaiAndroid >= 65){
        nilaiAndroidHuruf ="C";
    }
    else if (nilaiAndroid >=55){
        nilaiAndroidHuruf ="D";
    }
    else{
        nilaiAndroidHuruf ="E";
    }
        
    if (nilaiAndroidHuruf =="A" && wajah =="Ganteng" && asal =="Malang"){
        System.out.println("Mau banget");
    }
    else if (nilaiAndroidHuruf =="C" && wajah =="Ganteng" && asal =="Malang"){
        System.out.println("Boleh lah");
    }
    else if (asal =="Malang"){
        System.out.println("Saya pikir pikir dulu");
    }
    else {
        System.out.println ("Absolutely no");
    }        
   
 }    
}
