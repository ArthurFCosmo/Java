package tiposprimitivos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float salario = (float)2300.50;
        
        System.out.println("Vamos usar os prints comuns.");
        
        System.out.println("");
        
        System.out.println("O salario sera de: " + salario);
        System.out.print(salario);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Agora vamos usar o printf (formatado)");
        
        System.out.printf("O salario sera de: %.2f \n", salario);
        
        System.out.println("");
        
        System.out.println("Agora vamos usar a funcionalidade de entrada de dados. \n");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("");
        
        System.out.print("Digite sua idade: ");
        Integer idade = teclado.nextInt();
        
        System.out.println("");
        System.out.printf("Seu nome e %s, voce tem %d anos.", nome, idade);
    }
}
