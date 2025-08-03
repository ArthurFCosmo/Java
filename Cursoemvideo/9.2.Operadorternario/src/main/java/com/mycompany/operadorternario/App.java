/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadorternario;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class App {

    public static void main(String[] args) {
        int n1, n2, r;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        n1 = teclado.nextInt();
        System.out.println("Digite outro numero: ");
        n2 = teclado.nextInt();
        r = (n1>n2) ? n1 : n2;
        
        System.out.printf("O maior numero digitado foi %d", r);
    }
}
