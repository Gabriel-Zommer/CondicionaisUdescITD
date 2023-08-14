/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu saldo: ");
        double Saldo = s.nextDouble();
        double Porcentagem30 = 30.0 / 100.0;
        double Porcentagem40 = 40.0 / 100.0;
        double Porcentagem50 = 50.0 / 100.0;
        double ValorFinal30 = Saldo + (Porcentagem30 * Saldo);
        double ValorFinal40 = Saldo + (Porcentagem40 * Saldo);
        double ValorFinal50 = Saldo + (Porcentagem40 * Saldo);
        //System.out.println(ValorFinal30);
        
        if(Saldo < 501){
            System.out.println("nenhum crédito");
        }else if((Saldo >= 501)&&(Saldo <= 1000)){
            System.out.println("saldo é de: " + Saldo);
            System.out.println("crédito é de: " + ValorFinal30);
        }else if((Saldo >= 1001)&&(Saldo <= 3000)){
            System.out.println("saldo é de: " + Saldo);
            System.out.println("crédito é de: " + ValorFinal40);
        }else if(Saldo >= 3001){
            System.out.println("saldo é de: " + Saldo);
            System.out.println("crédito é de: " + ValorFinal50);
        }
        
    }
}
