Tags: #Criando_e_configurando #Sintaxe #Métodos

---

## 🔨 Criando o projeto

Para criar esse projeto novo, vamos fazer de uma maneira simples.

Basta ir em new Java project > Java with Ant > Java application

Após isso, não devemos desmarcar o botão de criar uma nova classe, pois nesse projeto não criaremos arquivos de JPanel, vamos importá-los.

---
## 📦 Biblioteca JOptionPane

Após isso, importaremos a biblioteca `JOptionPane`, que serve para criar janelas pre-configuradas.

```java
import javax.swing.JOptionPane;
```

No código, podemos exibir uma janela de mensagem ao executá-lo, basta usar o método:

```java
JOptionPane.showMessageDialog(null, "Mensagem desejada");
```

![[img18_joptionpane.png]]

Também podemos criar uma janela de input, para receber dados do usuário, além disso, podemos atribuí-la a uma variável com o método:

```java
valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Mensagem de input"));
```

![[img19_joptionpane2.png]]

Com isso, neste exercício criaremos um código que soma vários inputs do usuário:

```java
package pkg9.pkg9.soma_while;

import javax.swing.JOptionPane;

public class Soma_while {

// Janela para receber os inputs

    public static void main(String[] args) {
        int valor;
        int soma = 0;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe números. (Insira 0 para soma-los)"));
            soma += valor;
        } while (valor != 0);

// Janela para mostrar os resultados

        JOptionPane.showMessageDialog(null, "Somatório vale: " + soma);  
    }
        
}
```

---

[[Java 23 - Estruturas de repetição (Laços)]]

