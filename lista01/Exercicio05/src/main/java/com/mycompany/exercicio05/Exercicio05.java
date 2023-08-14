/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio05;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exercicio05 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Opções:");
        System.out.println("Prato: 1 - Vegetariano, 2 - Peixe, 3 - Frango, 4 - Carne");
        System.out.println("Sobremesa: 1 - Abacaxi, 2 - Sorvete diet, 3 - Mousse diet, 4 - Mousse chocolate");
        System.out.println("Bebida: 1 - Chá, 2 - Suco de laranja, 3 - Suco de melão, 4 - Refrigerante diet");

        System.out.print("Escolha o prato (número): ");
        int prato = scanner.nextInt();

        System.out.print("Escolha a sobremesa (número): ");
        int sobremesa = scanner.nextInt();

        System.out.print("Escolha a bebida (número): ");
        int bebida = scanner.nextInt();

        double caloriasPrato = calcularCaloriasPrato(prato);
        double caloriasSobremesa = calcularCaloriasSobremesa(sobremesa);
        double caloriasBebida = calcularCaloriasBebida(bebida);

        double caloriasTotais = caloriasPrato + caloriasSobremesa + caloriasBebida;

        System.out.println("Total de Calorias: " + caloriasTotais);

        scanner.close();
    }

    public static double calcularCaloriasPrato(int prato) {
        if (prato == 1) {
            return 180;
        } else if (prato == 2) {
            return 230;
        } else if (prato == 3) {
            return 250;
        } else if (prato == 4) {
            return 350;
        } else {
            return 0;
        }
    }

    public static double calcularCaloriasSobremesa(int sobremesa) {
        if (sobremesa == 1) {
            return 75;
        } else if (sobremesa == 2) {
            return 110;
        } else if (sobremesa == 3) {
            return 90;
        } else if (sobremesa == 4) {
            return 200;
        } else {
            return 0;
        }
    }

    public static double calcularCaloriasBebida(int bebida) {
        if (bebida == 1) {
            return 5;
        } else if (bebida == 2) {
            return 80;
        } else if (bebida == 3) {
            return 75;
        } else if (bebida == 4) {
            return 10;
        } else {
            return 0;
        }
    }
}