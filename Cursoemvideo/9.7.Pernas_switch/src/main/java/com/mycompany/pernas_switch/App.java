/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pernas_switch;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo;
        
        System.out.print("Digite um número de 1 a 5: ");
        int X = teclado.nextInt();
        
        tipo = switch (X) {
            case 1 -> "Mínimo";
            case 2 -> "Pouco";
            case 3 -> "Ideal";
            case 4 -> "Muito";
            case 5 -> "Máximo";
            default -> "Inválido";
        };
        
        System.out.println(tipo);
    }
}
