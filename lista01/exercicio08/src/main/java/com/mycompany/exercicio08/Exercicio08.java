/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio08;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite suas notas aqui: ");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        double nota4 = s.nextDouble();
        
        double soma = nota1 + nota2 + nota3 + nota4;
        double mediaFinal = soma / 4;
        
        if(mediaFinal >= 7){
            System.out.println("você está aprovado! " + mediaFinal);
        }else{
            System.out.println("em exame! " + mediaFinal);
            System.out.println("nota do exame:  ");
        }
        double notaDoExame = s.nextDouble();
        double somaFinal = mediaFinal + notaDoExame;
        double resultadoFinal = somaFinal / 2;
        
        if(resultadoFinal >= 5){
            System.out.println("aluno aprovado em exame " + resultadoFinal);
        }else{
            System.out.println("reprovado " + resultadoFinal);
        }
    }
}
