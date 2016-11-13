
package com.wordpress.ristianaristi.app12141424;

import java.util.Scanner; //mengimport java Scanner

public class app12141424 { // classapp12141424

    public static void main(String[] args) {         
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama = "); //input nama
        Player pemain = new Player(input.nextLine()); // instant of class
        System.out.println("Masukkan nama kamu untuk memulai atau tekan 'T' utuk keluar");
        if (!"T".equals(pemain.nama))
        do{
       pemain.tampilNama();//memanggil method tampilNama pada class Player
       System.out.println("Nilai : " + pemain.getScore());//menampilkan nilai/score
       System.out.println("Terimakasih"); 
       System.out.println("Apakah kamu ingin melanjutkan ke level berikutnya? (y/n)"); //statement apakah ingin lanjut ke level berikutnya?
       input.nextLine().charAt(0);
       if(pemain.jwb=='y')//jika jawab y maka akan lanjut ke level berikutnya
           pemain.level++; //level ++ untuk naik ke level seterusnya
        }while (pemain.jwb=='y');
  
    } 
}
