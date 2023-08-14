/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio07;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("escreva um numero inteiro: ");
        int numero = s.nextInt();
        int resultado = numero % 2;
        //System.out.println(resultado);
        
        if(resultado == 0){
            System.out.println("o numero é par");
        }else{
            System.out.println("o numero é impar");
        }
    }
}
