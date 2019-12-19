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


//        while (kondisi) {
//            aksi
//        }

        int a = 20;
        int b = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + b);

            if (a == 0){
                kondisi = false;
            }

            a--;
            b++;
        }

        System.out.println("akhir program");

    }
}
