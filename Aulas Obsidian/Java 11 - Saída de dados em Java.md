Tags: #Sintaxe #Métodos

---
## Comandos para saída de dados

### ✏ Prints comuns

Vamos utilizar comandos que já aprendemos antes como exemplo.

- `System.out.print()` que escreve uma mensagem na tela.
- `System.out.println()` que escreve uma mensagem na tela e pula para a próxima linha.

Vamos aplicá-los com o seguinte código:

```java
package tiposprimitivos;

public class App {

    public static void main(String[] args) {
        float salario = (float)2300.50;
        System.out.println("O salario sera de: " + salario);
        System.out.print(salario)
    }
}

```

Resultando, como esperado, em:

`O salario sera de: 2300.5`
`2300.5`

### ✉ Printf (Formatado)

Obs: Você pode utilizar o `System.out.format()`, que funcionará da mesma maneira que o `printf`.

---

Esse comando serve para adicionar vários elementos dentro do print sem precisar concatená-los da maneira convencional, e facilitando a configuração de casas decimais para valores float.

Vamos aplica-lo com o seguinte código:

```java
float salario = (float)2300.50;
System.out.printf("O salario sera de: %f", salario);
```

Resultando em:

`O salario sera de: 2300,500000`

Esse `%f` significa que ali será inserido um valor do tipo `float`, e ele é referenciado logo após fechar as aspas.

Pelo valor ser `float`, podemos configurar as casas decimais dele. Para isso, basta botar a quantidade de casas que você deseja exibir entre o <mark style="background: #727272;">%</mark> e o <mark style="background: #727272;">f</mark>, antecedida de um ponto. Ficando assim:

```java
float salario = (float)2300.50;
System.out.printf("O salario sera de: %.2f", salario);
```

Resultando, como esperado, em:

`O salario sera de: 2300,50`

#### Quebra de linha

Como não estamos usando o `println`, pode ser que queiramos pular para a próxima linha após o `print`. Para fazer isso, basta colocar dentro das aspas do print, no final, um `\n`, ficando assim no código:

```java
float salario = (float)2300.50;
System.out.printf("O salario sera de: %.2f \n", salario);
```

---

[[Java 12 - Entrada de dados]]