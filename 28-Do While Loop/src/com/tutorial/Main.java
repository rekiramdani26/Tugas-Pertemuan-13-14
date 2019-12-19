/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author Reki Ramdani
 * NIM : A2.1900146
 */
public class Main {


    public static void main (String[] args){


//        do {
//            aksi
//        } while (kondisi);


        System.out.println("ini adalah awal program");

        int a = 10;
        int b = 0;
        boolean kondisi = true;


        do {
            a--;
            ++b;
            System.out.println("do while ke-" + b);

            if (a == 0) {
                kondisi = false;
            }

        }while(kondisi);

        System.out.println("ini adalah akhir program");
    }
}
