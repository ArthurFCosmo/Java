/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg9.pkg3.metodos;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Insira o primeiro valor a ser somado: ");
        Scanner teclado = new Scanner(System.in);
        int v1 = teclado.nextInt();
        
        System.out.print("Insira o segundo valor: ");
        int v2 = teclado.nextInt();
        
        System.out.println("O resultado da soma e: " + Operacoes.soma(v1, v2));
    }
}
