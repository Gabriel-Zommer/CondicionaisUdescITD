/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio04;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe sua idade: ");
        int idade = s.nextInt();
        
        if(idade < 16){
            System.out.println("não eleitor");
        }else if((idade >= 18)&&(idade <= 65)){
            System.out.println("eleitor obrigatório");
        }else if((idade == 16)||(idade == 17)||(idade > 65)){
            System.out.println("eleitor facultativo");
        }
    }
}
