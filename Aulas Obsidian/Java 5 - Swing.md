Tag: #pacote

---

## 📝Criando projeto

O pacote swing auxilia o programador a desenvolver interfaces gráficas.

Vamos criar um Olá mundo com isso.

Primeiro, no NetBeans, vamos fazer o seguinte.

- Novo projeto
- Java with Maven (Ou apenas Java)
- Java Application
- Next >
- Dar nome ao projeto (2.OlamundoSwing)
- Renomear o pacote
- Criar o projeto >
- Deletei a Classe que já vem criada dentro do pacote
- Dentro do pacote (selecionado), clicar no botão no canto superior esquerdo "new file"
- Swing GUI Forms > Forms JFrame
- Next >
- Dar nome à classe (CamelCase começando maiúsculo)
- Dar nome ao pacote (Minúsculas)
- Finish >

[[Java 5.1 - Configurando Classe principal com o Maven em projetos JFrame]]

Pronto, após esses passos, o NetBeans vai criar a <mark style="background: #727272;">classe</mark> junto com um janela.

![[img05 jframe.png]]

Se você fechar as janelas sem querer, basta ir no <mark style="background: #7A6300;">menu superior do NetBeans > window > Reset windows</mark> .

## 📺 Criando o JFrame

Na janela central, no canto superior esquerdo dela, temos dois botões:

- Source: Mostra o código fonte
- Design: Mostra a janela

Na janela da direita, temos a aba <mark style="background: #727272;">Pallete</mark>, dela vamos puxar nossas funcionalidades para o JFrame (Janela central)

![[img06 jframe2.png]]

Coloquei um <mark style="background: #7A6300;">Label</mark> e um <mark style="background: #7A6300;">Botão</mark>.

No Label, posso clicar com o botão direito, ir em <mark style="background: #727272;">propriedades</mark> e alterar por exemplo, o Text e o tamanho da fonte.

O mesmo pode ser feito com o nosso botão.

![[img07 jframe3.png]]

Posso mudar o nome desses elementos clicando neles com o botão direito e escolhendo <mark style="background: #727272;">change variable name</mark>.

## ⚙ Programando funcionalidades

Vamos criar uma funcionalidade para o <mark style="background: #7A6300;">botão</mark>.

Clicamos nele com o `botão direito > Events > Action > actionPerformed`;

Ao clicar, seremos desviados para o editor de código.

Ao ver o editor de código, perceba que já foi criado muito código, tudo graças ao Swing que configurou tudo que nós fizemos arrastando elementos para o JFrame.

Mas o que interessa é o código selecionado.

```java
private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {                           
        // TODO add your handling code here:
    }        
```

Temos o nome do nosso elemento <mark style="background: #7A6300;">Botao1</mark>, e o evento <mark style="background: #7A6300;">ActionPerformed</mark>. Dentro dessas chaves {} vamos digitar nosso código, que acontecerá quando clicar no botão durante a execução do nosso app. Ficando assim:

```java
private void Botao1ActionPerformed(java.awt.event.ActionEvent evt){
	Texto1.setText("Olá Mundo!")
}
```

Adicionando a linha 2 `Texto1.setText("Olá Mundo!")`, teremos a ação de mudar o texto do nosso Label <mark style="background: #7A6300;">Texto1</mark> para "Olá mundo" quando o <mark style="background: #7A6300;">botão</mark> for clicado.

Continuar de: # Aula 5 – Introdução ao Swing e JavaFX 18:22