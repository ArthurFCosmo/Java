Tags: #Criando_e_configurando #Métodos #Ferramentas #Sintaxe 

---
## 🔨 Adicionando as funcionalidades

Vamos criar um JFrame usando Swing.

Após criar, na tela de construção vamos adicionar:

- 2 Textfields
- 1 Button
- 2 Labels

Dessa maneira:
![[img12_swing1.png]]

Após isso, vamos mudar o nome e o texto de todas as variáveis clicando nelas com o direito do mouse.

Apaguei o texto de umas, redimensionei os <mark style="background: #727272;">textfields</mark> com o mouse, renomeei todas. Ficou assim:

![[img13_swing2.png]]

## ⚙ Configurando o código fonte

Agora vamos configurar o evento do app. No caso, o usuário colocará valores em ambas as caixas, ao clicar no botão de igualdade, o evento será ativado.

`Clicar no botao com o direito do mouse > events > action performed`

Após isso, o editor de código será aberto.

No nosso código, teremos grande parte gerada pela ferramenta, que configurou todo o front-end.

O que nos interessa é configurar o que está dentro da classe do evento

```java
private void bntSomaActionPerformed(java.awt.event.ActionEvent evt) {}
```

Essa é a classe. Vamos fazer em duas etapas, primeiro vamos ler os valores e mudar o resultado:

```java
private void bntSomaActionPerformed(java.awt.event.ActionEvent evt) {            
        int N1 = txtN1.getText();
        int N2 = txtN2.getText();
        int soma = N1 + N2;
        lblSoma.setText(soma);
    }    
```

Com esses comandos criamos duas variáveis `int`, `N1` e `N2`. Criamos também uma variável `int` `soma` que receberá a soma de `N1` e `N2`. Usamos o método `.getText()` para atribuir o valor dos <mark style="background: #727272;">textfields</mark> às variáveis no momento em que o botão é apertado na interface gráfica do app.

Após isso eles são somados e armazenados na variável soma e o `label` exibirá ele na interface a partir do método `.setText()`.

--- 

No entanto, isso não funcionará, visto que nos `.getText()` recebemos valores string, e tentamos colocar eles em variáveis int. Para corrigir isso, usaremos o que aprendemos na aula [[Java 13 - Incompatibilidade entre tipos]].

Fazendo com que o código fique assim:

```java
    private void bntSomaActionPerformed(java.awt.event.ActionEvent evt) {          
        int N1 = Integer.parseInt(txtN1.getText());
        int N2 = Integer.parseInt(txtN2.getText());
        int soma = N1 + N2;
        lblSoma.setText(Integer.toString(soma));
    }                                       
```

Veja que utilizamos classes e métodos como `.parseInt()` e `.toString()` para converter os dados para os tipos corretos.

---

[[Java 15 - Criando uma aplicação com imagens]]