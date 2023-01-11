/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo2.praktikumpbo2;

import java.util.Scanner;

/**
 *
 * @author PRAYOGO
 */
public class Input {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nama Anda: ");
    String nama = input.nextLine();

    System.out.println("Selamat pagi, " + nama + "!");
  } 
}
