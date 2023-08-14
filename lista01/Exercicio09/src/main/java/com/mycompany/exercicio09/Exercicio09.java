/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio09;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalValores = 5;
        int[] valores = new int[totalValores];
        int soma = 0;

        // Lê os valores e calcula a soma
        for (int i = 0; i < totalValores; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextInt();
            soma += valores[i];
        }

        // Calcula a média
        double media = (double) soma / totalValores;

        System.out.println("Média: " + media);
        System.out.println("Valores superiores à média: ");

        // Imprime os valores superiores à média
        for (int i = 0; i < totalValores; i++) {
            if (valores[i] > media) {
                System.out.println(valores[i]);
            }
        }

        scanner.close();
    }
}
