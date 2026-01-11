/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg9.soma_while;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class Soma_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        int soma = 0;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe números. Um de cada vez, e clicando ok para informar outro. (Insira 0 para soma-los)"));
            soma += valor;
        } while (valor != 0);
        
        JOptionPane.showMessageDialog(null, "Somatório vale: " + soma);
        
    }
    
}
