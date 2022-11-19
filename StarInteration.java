/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.interation;

/**
 *
 * @author Lenovo
 */
public class StarInteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        //i = banyak baris ke bawah. karena i=1 ; i<=3 makan banyak baris ke bawah adalah 3
        for( i=1; i<=3; i++)   
        {   
        //j = banyak kolom ke kanan. karena j=1 ; j=i. maka di baris pertama itu hanya satu bintang yang muncul karena i=1. dan jumlahnya akan bertambah sesuai jumlah i tetapi hanya sampe di i=3
        for(j=1; j<=i; j++)   
        {   
        //untuk menampilkan bintang
        System.out.print("*");   
        }   
        //untuk menampilkan bintang turun ke bawah
        System.out.println();   
     
        }
    }
}

