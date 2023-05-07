/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KOD;

import ARAYUZ.MainFrm;


/**
 *
 * @author oguzh
 */

  

public class MainCode extends KontrolClass{
     public void programHaber(){
            System.out.println("Program Main Sınıfı Kontrol Edildi.");
}
    
    public static void main(String[] args) {
        
        //POLİMORFİZM
        KontrolClass c[]=new KontrolClass[2];
        
        c[0]= new MainCode();
        c[1]=new DbBaglanti();
      
        calis(c);
        
        //GUI OLARAK PROGRAMIN BAŞLAMASI
        MainFrm frame1=new MainFrm();
        frame1.setVisible(true);
        
        
        
    }
    

 public static void calis(KontrolClass c[]){
        for(int  i=0; i<c.length;i++){
            c[i].programHaber();
            
        }
    }

}