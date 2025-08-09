/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorial_do_simples;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class App {

    public static void main(String[] args) {
        
        // ler o valor
        
        
        System.out.print("Insira o valor: ");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        
        // calcular o fatorial
        
        int soma = 1;
        
        do {
            soma *= valor;
            --valor;
            
            System.out.println("Valor: " + valor);
            System.out.println("Soma: " + soma);
        } while (valor >= 2);
        
        // esrevendo o valor na sela
        
        System.out.println("Valor do fatorial: " + soma);
    }
}
