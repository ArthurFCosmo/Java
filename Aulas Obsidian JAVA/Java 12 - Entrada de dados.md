Tags: #Sintaxe #Métodos 

---
## ⌨ Como solicitar dados pelo teclado?

Para solicitar dados com o teclado é necessário fazer a importação de uma biblioteca, visto que o conjunto de bibliotecas padrão `Java.lang` não possui essa funcionalidade. Para isso, importaremos uma biblioteca:

```java
import java.util.scanner;
```

Para usar o scanner, é preciso criar um objeto para receber o valor que será inserido.

Para ler dados, primeiro é necessário criar um objeto que receberá esses dados. Para isso, podemos usar o seguinte comando:

```java
Scanner teclado = new Scanner(System.in);
String palavra = teclado.nextLine();
```

Na linha 1, estamos usando o método `new` para criar um novo Scanner, e dentro do Scanner, temos o parâmetro `System.in`, que indica o dispositivo que ele irá monitorar. `System.out` é a tela, já o `System.in` é o teclado.

Na linha 2, estamos criando uma variável do tipo <mark style="background: #727272;">String</mark> para armazenar o que será digitado pelo usuário com o comando `teclado.nextLine()`.

## 🔨 Exemplo

Vamos criar um programa que lê nome e idade e depois exibe na tela:

```java
package tiposprimitivos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("");
        
        System.out.print("Digite sua idade: ");
        Integer idade = teclado.nextInt();
        
        System.out.println("");
        System.out.printf("Seu nome e %s, voce tem %d anos.", nome, idade);
    }
```

Resumindo: 

1. Importamos o scanner
2. Criamos o objeto
3. Fizemos a mensagem
4. Criamos uma variável, lemos os dados de string com o `teclado.nextLine()` e colocamos o objeto dentro dela
5. Fizemos outra mensagem
6. Criamos mais uma variável, lemos os dados de int com o `teclado.nextInt()` e colocamos o objeto dentro dela
7. Exibimos tudo com a formatação correta para string e int

---

[[Java 13 - Incompatibilidade entre tipos]]

