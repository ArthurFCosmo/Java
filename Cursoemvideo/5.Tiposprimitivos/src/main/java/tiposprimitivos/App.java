package tiposprimitivos;

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
        
        System.out.printf("O salário sera de: %.2f", salario);
    }
}
