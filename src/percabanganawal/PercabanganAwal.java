/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabanganawal;

import java.util.Scanner;

/**
 *
 * @author yusri
 */
public class PercabanganAwal {
    private static Object scanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Identitas="Pramuda Yusril Mustofa/X Rpl 2/29";
        System.out.println("Identitas:"+Identitas);
        //Initial commit
        Scanner awal=new Scanner(System.in);
        System.out.print("nilai a?");
        int a= awal.nextInt();
        
        System.out.println("\nIF.. 1");
        if(a<5) System.out.println("nilai a kurang dari 5");
        
        System.out.println("\nIF.. 2");
        if(a==5) System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIF.. 3");
        if(a>5); {      System.out.println("Isi variabel a:"+a);
        System.out.println("Nilai a lebih dari 5");
         }
        System.out.println("\nIF..ELSE..");
        if(a<5){
            System.out.println("Isi variable a:"+a);
            System.out.println("Nilai a lebih besar dari 5");
        }  else  System.out.println("Nilai a lebih dari atau sama dengan 5");
         
        // coba IF..ELSE
        System.out.println("\nIF..ELSE.. IF..ELSE.. 1");
        if (a<5) {
                System.out.println("nilai a kurang dari 5");
        } else if(a==5){
          System.out.println("nilai a sama dengan 5");
        } else
            System.out.println("nilai a lebih dari 5");
        
        System.out.println("\nIF..ELSE IF..ELSE..2");
        if (a<2){
            System.out.println("nilai a kurang dari 2");
        } else if (a<4){
            System.out.println("nilai a kurang dari 2");
        } else if(a<6){
            System.out.println("nilai a kurang dari 6 ");
        } if (a>6) {
            System.out.println("nilai a lebih dari 6");
        }
        // coba IF..ELSE..IF..ELSE
         System.out.println("\nNested IF");
         if (a<7) {
             System.out.println("nilai a kurang dari 7");
         if (a>2)
             System.out.println("nilai a lebih dari 2");
         if (a<4)
             System.out.println("nilai a kurang dari 4");
         }
         //Coba Nested IF
         System.out.println("\nSwitch..Case");
         switch (a){
             case 1:System.out.println("nilai a =>1");break;
             case 2:System.out.println("nilai a =>2");break;
             case 3:
             case 4:System.out.println("nilai a =4 atau 3");break;
             case 5:System.out.println("nilai a=>5");break;
             default:System.out.println("nilai a bukan antara 1-5");
                 
         // Coba operator Ternary
              int nilai;
               Scanner baca=new Scanner(System.in);
                 System.out.println("\nNilai anda?");
                 nilai=baca.nextInt();
                 
                 String grade=(nilai <75)?"belum kompeten":"kompeten";
                 System.out.println(nilai +"=>"+grade);
         }
                 
}}
