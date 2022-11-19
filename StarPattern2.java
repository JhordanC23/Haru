/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.pattern.pkg2;

/**
 *
 * @author Lenovo
 */
public class StarPattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // untuk menampilkan jmlah baris. karena i=1 ; i<=3 maka barisnya hanya 3
        for (int i=1; i<=3;i++)
       {
           //untuk menampilkan banyak kolom. Karena j=1; j<=3 maka banyak kolom adalah 3
           for (int j =1; j<=3; j++)
           {
               //jika i!=3 atau  bukan baris ketiga
               if (i !=3)
               {
               //jika j=1 atau j=3, maka kolom 1 dan 3 akan kosong
               if (j==1||j==3)
               {System.out.print(" ");}
               else 
               //jika j bukan kolom 1 dan 3, maka print bintang
               {System.out.print("*");}
               }
               else 
               //jika merupakan baris ketiga maka print bintang di ketiga kolom
               {
               System.out.print("*");
               }
               }
               System.out.println(" ");
       }
    }
    }
    


