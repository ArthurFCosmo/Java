Tags: #Criando_e_configurando #Métodos #Sintaxe 

---

## 📦 Iniciando o projeto

Vamos fazer um projeto de criar e manipular uma lista. O programa consiste em uma lista, que poderemos manipular seus valores.

Criamos sem o Maven novamente, usando o Swing. Vamos em > projeto Java com o Ant, sem classe principal, depois criamos o JFrame dentro do pacote.

## 🔨 Colocando elementos no JFrame

Vamos deixar o JFrame assim:

![[img21_lista.png]]

- 1 Label fixo
- 1 Spinner numérico
- 3 Botões
- 1 Label fixo
- 1 Label variável (Azul)
- 1 Lista

A lista precisa de uma configuração prévia, que consiste em colocar essa linha logo no começo do código, após a declaração da classe:

```java
DefaultListModel lista = new DefaultListModel();
```

Após isso, vamos no Swing, clicamos na lista > Propriedades > model > ... > na cascata, colocar custom code > jList1.setModel > Colocar o nome do objeto que criamos (lista)

## ⚙ Fazendo o código

### ✏ Declarando variáveis

Primeiro, começamos declarando nosso `vetor` e nossa variável que conterá o índice selecionado, esse código entrará logo após a abertura de classe nas <mark style="background: #7A6300;">linhas 3 e 5</mark>:

```java
public class LISTAVETOR extends javax.swing.JFrame {
    
    int vetor[] = new int[10];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;
```

### 📝 Adicionando valores e mostrando a lista

Na configuração do clique do botão "adicionar", faremos isso:

```java
private void botaoADActionPerformed(java.awt.event.ActionEvent evt) {               
        vetor[selecionado] = Integer.parseInt(jSpinner1.getValue().toString());
        lista.removeAllElements();
        
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    } 
```

Primeiro, no código da <mark style="background: #7A6300;">linha 2</mark>, adicionaremos o valor do Spinner no vetor, usando o índice que está selecionado (que por padrão definimos como 0, mas depois vamos fazer o usuário escolhe-lo).

Na <mark style="background: #7A6300;">linha 3</mark>, vamos remover todos os elementos da lista no Swing, os valores do vetor continuam estáticos.

Nas <mark style="background: #7A6300;">linhas 5 e 6</mark>, vamos recriar a lista swing com os valores já atualizados na hora em que o botão foi clicado.

### 👁 Mostrando a lista ao iniciar o programa

Precisamos mostrar a lista ao iniciar o programa, colocando todos os valores para 0 na <mark style="background: #7A6300;">linha 9</mark>, para mostrar a lista, usaremos o mesmo laço de antes nas <mark style="background: #7A6300;">linhas 9 e 10</mark>:

```java
public class LISTAVETOR extends javax.swing.JFrame {
    
    int vetor[] = new int[10];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    public LISTAVETOR() {
        initComponents();
        Arrays.fill(vetor, 0);
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }
```

### 📌 Fazendo com que o vetor seja o item clicado na lista

Agora queremos fazer com que o usuário consiga escolher o índice clicando em um item da lista, para isso, acessaremos o código da configuração da lista:

Clique direito na lista diretamente no JFrame > events > mouse > `mouseClicked [ ]`

Nele, vamos inserir o seguinte código:

```java
selecionado = jList1.getSelectedIndex();
indiceVetor.setText(Integer.toString(selecionado));
```

Na <mark style="background: #7A6300;">linha 1</mark>, teremos o valor da variável selecionado sendo definido pelo índice do item clicado na lista. Já na <mark style="background: #7A6300;">linha 2</mark>, mudaremos o label do índice selecionado, no JFrame.

### 🗑 Removendo um valor da lista

Para remover um valor da lista é muito simples, basta definir como 0 o valor do índice selecionado. Usaremos o seguinte código:

```java
private void botaoRMActionPerformed(java.awt.event.ActionEvent evt) {               
        vetor[selecionado] = 0;
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }  
```

Na <mark style="background: #7A6300;">linha 3</mark>, limpamos a lista da tela, e nas <mark style="background: #7A6300;">linhas 4 e 5</mark> reescrevemos ela com os valores atualizados.

### 📌 Ordenando os valores da lista

Para ordenar os valores da lista, utilizaremos novamente a biblioteca `Arrays`:

```java
private void botaoODActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Arrays.sort(vetor);
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
```

Com apenas um comando, ordenamos a lista de maneire crescente, `Arrays.sort(vetor)`. Nas outras linhas, limpamos a lista e mostramos ela atualizada.

---

[[Java 25 - Métodos (Funções)]]






