/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorial_for_simples;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira o valor: ");
        int valor = teclado.nextInt();
        System.out.println(valor);
        
        int soma = 1;
        
        for (int C = valor; C > 1; C--) {
            
            soma *= C;
            System.out.println(soma);
        }
        
        System.out.println("Valor: " + soma);
    }
}