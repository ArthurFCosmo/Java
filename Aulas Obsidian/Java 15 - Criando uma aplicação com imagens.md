Tags: #Criando_e_configurando #Sintaxe #Métodos 

---

## 🔨 Criando o projeto (Sem o Maven, pela primeira vez)

No NetBeans, vamos executar os seguintes passos:

- New project
- Java with Ant > Java Application
- Dar um nome ao projeto
- Escolher a pasta
- Desmarcar `Create main class`

### 📦 Crie pacotes

Ele criará um projeto, em `Source Packages`, deveremos clicar com o direito > New > Java Package.

Colocar um nome, concluir.

Vamos fazer esse processo de criar pacote mais uma vez, ficando assim com dois pacotes.

Nomeei eles como "classes" e "imagens".

### 🖥 Crie o JFrame

No pacote classes, crie um novo JFrame.

Imagens > clique direito > new > Swing GUI Forms > JFrame Form

Dê um nome.

Pronto.

## 🔨 Adicionando funcionalidades

Deixei nosso JFrame assim:

![[img14_swing3.png]]

- 3 labels (ano de nascimento; idade; 0)
- 1 button (calcular)
- 1 spinner
- 1 imagem

Coloque nome nos elementos.

O spinner serve para adicionar valores numéricos, seja com o teclado com suas setinhas.

### 📸 Adicionando imagem no Swing

Para adicionar a imagem, usaremos o pacote imagens que criamos anteriormente.

- Crie um label
- Exclua o texto dentro dele
- Em properties, clique nas reticências do campo icon
- Import to project
- Localize a imagem no computador
- Next>
- Escolha o pacote, escolhi o imagens que criei no começo do projeto
- Finish>
- Ok>

Infelizmente no Swing não podemos redimensionar as imagens pelo editor gráfico, precisamos mexer no código. Por isso que o JavaFX é melhor 😅.

## ⚙Configurando o código

Vamos no nosso botão de calcular > botão direito > events > action > action performed

Dentro de do bloco de código da ação, configuraremos nossos dados e variáveis.

```java
private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                       int ano = txtAN.getValue();
        int idade = 2025 - ano;
        lblIdade.setText(idade);
    }  
```

Primeiro pegamos o valor do `spinner`, e colocamos dentro de uma variável <mark style="background: #7A6300;">ano</mark> do tipo `int`. 

Depois fazemos o cálculo da idade e armazenamos em uma nova variável do tipo `int` chamada <mark style="background: #7A6300;">idade</mark>.

Por último, basta mudar o label para a idade calculada usando o método `.setText()`.

Porém, há uma grande incompatibilidade nos tipos utilizados. Esse código não vai funcionar. Para isso precisamos corrigi-los da forma que aprendemos na aula [[Java 13 - Incompatibilidade entre tipos]].

## ⚠ Corrigindo o código

O novo código deve ficar assim:

```java
private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int ano = Integer.parseInt(txtAN.getValue().toString());
        int idade = 2025 - ano;
        lblIdade.setText(Integer.toString(idade));
    }
```

Na linha 2, corrigimos o .`getValue()` convertendo ele para <mark style="background: #727272;">string</mark> primeiro com o `.toString()`, e depois convertendo para <mark style="background: #727272;">int</mark> com o `Integer.parseInt()`. 

Na linha 4, convertemos idade de <mark style="background: #727272;">int</mark> para <mark style="background: #727272;">string</mark> novamente usando a WrapperClass `Integer.toString()`.

---

