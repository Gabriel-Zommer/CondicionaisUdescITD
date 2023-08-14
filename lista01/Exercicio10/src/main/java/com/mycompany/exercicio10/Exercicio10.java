/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio10;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite o peso total dos peixes: ");
        double pesoDosPeixes = s.nextDouble();
        
        final double limitePeso = 500;
        final double multaPorQuilo = 4.0;
        
        if(pesoDosPeixes > limitePeso){
            double excesso = pesoDosPeixes - limitePeso;
            double multa = excesso * multaPorQuilo;
             System.out.println("Excesso de peso: " + excesso + " kg");
             System.out.println("Multa a ser paga: R$ " + multa);
        }else{
            System.out.println("Não há multa por excedente de peso.");
        }
    }
}
