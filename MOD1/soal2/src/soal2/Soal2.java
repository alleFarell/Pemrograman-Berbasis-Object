/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

import java.util.Scanner;
/**
 *
 * @author Afif Raihan
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int terkecil;
        Scanner bilangan = new Scanner(System.in);
        System.out.print("Bilangan 1: ");
        int bil1 = bilangan.nextInt();
        System.out.print("Bilangan 2: ");
        int bil2 = bilangan.nextInt();
        
        if(bil1>bil2){
            terkecil = bil2;
        }else{
            terkecil = bil2;
        }
        int fpb =0;
        for (int i = 1; i < terkecil+1; i++) {
            if(bil1%i==0&&bil2%i==0){
                fpb = i;
            }
        }
        System.out.println("FPB DARI " +bil1 +" dan "+bil2 +" = " + fpb);
        
        
        
        
    }
    
}
