/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio06;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("escreva um numero da semana: ");
        int numero = s.nextInt();
        
        if(numero == 1){
            System.out.println("é domingo");
        }else if(numero == 2){
            System.out.println("é segunda");
        }else if(numero == 3){
            System.out.println("é terça");
        }else if(numero == 4){
            System.out.println("é quarta");
        }else if(numero == 5){
            System.out.println("é quinta");
        }else if(numero == 6){
            System.out.println("é sexta");
        }else if(numero == 7){
            System.out.println("é sabado");
        }else{
            System.out.println("error!");
        }
        
    }
}
