package com.prayogo.praktikumpbo2.praktikumpbo2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRAYOGO
 */
public class Loop {
    public static void main(String[] args) {
  
    // For
    for(int i=0; i<10; i++) {
      System.out.println("Looping... (" + i + ")");
    }
    System.out.println("Looping For selesai! \n");


    // While
    int j = 1;
    while(j <= 100) {
      System.out.println("Loading... (" + j + "%)");
      j += 10;
    }
    System.out.println("Looping While selesai! \n");


    // Do-While
    int k = 10;
    do {
      System.out.println("Looping... (" + k + ")");
      k--;
    } while(k > 0);
    System.out.println("Looping Do-While selesai! \n");
  }
}
