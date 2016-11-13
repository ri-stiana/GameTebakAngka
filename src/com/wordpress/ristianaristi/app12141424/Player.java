
package com.wordpress.ristianaristi.app12141424;

import java.util.Scanner;

public class Player {
    String nama; //deklarasi variable
    long angka;
    int kesempatan = 4;
    int random;
    byte level = 1;
    char jwb;
    int score;
    short banyak=0;
    
    public Player(String nama) { //constructor Player
        this.nama = nama;
    }

   public void tampilNama(){ //method untuk menampilkan nama
   System.out.println("Hello " + nama);
   System.out.println("Selamat Datang di Game Tebak Angka, Kamu mempunyai 5 Kesempatan menjawab");
   System.out.println("Level " +level); //menampilkan level
   System.out.println("Masukkan angka 1-100");
   
     angka = Math.round(Math.random()*100%100+1); //proses random angka
     long check= 100;
     int kebenaran = -1;
      
   do{
        System.out.print("Masukkan angka = "); //input angka/tebakan kamu
        System.out.println("");
        
    
        Scanner jawab = new Scanner (System.in);
        int b = jawab.nextInt(); // mendeklarasikan jawaban

        if (kesempatan > 0 ){ 
        if ( b == angka ){//untuk menampilkan statement jika tebakan sama dengan jawaban
        System.out.println("CONGRATULATION!!!Kamu BENAR!");
        System.out.println("Anda berhasil menebak " + banyak + "  kali tebakan");//menampilkan hasil berapa kali menebak
        break;}

        else if ( b < angka ){//untuk menampilkan statement jika tebakan lebih kecil dari jawaban
            System.out.println("Angka Kamu terlalu KECIL.");}
        else if ( b > angka ){//untuk menampilkan statement jika tebakan lebih besar dari jawaban
        System.out.println("Angka Kamu terlalu  BESAR.");}

        System.out.println("    Kamu Memiliki " + kesempatan + " Kesempatan Lagi"); //menampilkan sisa kesempatan menebak
        System.out.println("---------------------------------------------------");
        kesempatan--;}

        else{
        System.out.println("Game Over!!");//jika kesempatan habis maka akan ditampilkan
        System.out.println("Angka yang dimaksud adalah " + angka); //menampilkan angka random/jawaban
        System.out.println("---------------------------------------------------");
        break;
        }
        }
         while ( kesempatan >=0 ); 
           
        
    }
   
   public int level (){ //method level digunakan untuk mengembalikan nili level
       return level * 100 ;
   }

   public int getScore() { //method getScore digunakan untuk menampilkan nilai akhir
    if (banyak == 1)  {
        score = 100 * level;
    }
    if (banyak == 2 * level)  {
        score = 70 ;
    }
    if (banyak == 3* level)  {
        score = 50 ;
    }
    if (banyak == 4 * level)  {
        score = 30 ;
    }
    if (banyak == 5 * level)  {
        score = 10 ;
    }
    return score;
    
   }
    
}