Tags: #Criando_e_configurando #Sintaxe #Métodos 

---

## 📦 Iniciando o projeto

Vamos fazer um projeto de criar uma lista numérica. O programa consiste em receber um valor inicial, um final, e um passo, depois exibir os valores em uma lista.

Criamos sem o Maven novamente, usando o Swing. Vamos em > projeto Java com o Ant, sem classe principal, depois criamos o JFrame dentro do pacote.

## 🔨 Colocando elementos no JFrame

Vamos deixar o JFrame assim:

![[img20_sliders.png]]

- 3 Labels fixos
- 3 Sliders
- 3 Labels variáveis (Azuis)
- 1 Botão
- 1 Painel com 1 label variável (Vermelho)
- 1 Painel com 1 Lista

Esses `sliders` vão mudar o valor dos labels da direita, o painel 1 vai aparecer com uma mensagem vermelha caso haja erro, o painel 2 vai aparecer com a lista caso nao haja erros.

## ⚙ Fazendo o código

### 1. Escondendo os painéis

```java
public Slides_for() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
    }
```

Vamos mudar esses valores booleanos de acordo com condicionais futuras.

### 2. Fazendo os labels mudarem de acordo com o slider

```java
private void SliderViStateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
        int vi = SliderVi.getValue();
        valorInicial.setText(Integer.toString(vi));
    }                                     

    private void SliderVfStateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
        int vf = SliderVf.getValue();
        valorFinal.setText(Integer.toString(vf));
    }                                     

    private void SliderPStateChanged(javax.swing.event.ChangeEvent evt) {                                     
        // TODO add your handling code here:
        int vp = SliderP.getValue();
        jPasso.setText(Integer.toString(vp));
    }
```

Nesses 3 blocos de códigos, temos várias redundâncias, elas são:

- Receber o valor do slider
- Mudar o valor do label para ser igual ao do slider

### 3. Fazendo as mensagens de erro

```java
jPanel2.setVisible(false);
        
        int vi = SliderVi.getValue();
        int vf = SliderVf.getValue();
        int vp = SliderP.getValue();
        
        DefaultListModel lista = new DefaultListModel();
        
        if (vi == vf) {
            jPanel1.setVisible(true);
            msgErro.setText("Valor inicial e valor do final devem ser diferentes.");
        } else if (vi > vf && vp > 0) {
            jPanel1.setVisible(true);
            msgErro.setText("Valor do passo deve ser negativo para listas decrescentes.");
        } else if (vi < vf && vp < 0){
            jPanel1.setVisible(true);
            msgErro.setText("Valor do passo deve ser positivo para listas crescentes.");
        } else if (vp == 0) {
            jPanel1.setVisible(true);
            msgErro.setText("Valor do passo deve ser diferente de 0.");
        }
```

1. Primeiro vamos desligamos o painel 2, fazendo com que ele seja apagado caso a leitura da condição em seguida seja `false`.

2. Depois, recebemos os valores dos sliders.

3. Depois definimos o modelo da lista com a biblioteca <mark style="background: #727272;">DefaultListModel</mark>.

4. Criamos as condições de erro, e as respostas para os eventos.

Agora caso não haja erros:

```java
else {
            jPanel1.setVisible(false);
            jPanel2.setVisible(true);
            
            if (vp > 0) {
                for (int c = vi; c <= vf; c += vp){
                lista.addElement(c);
                }
            } else {
                for (int c = vi; c >= vf; c += vp){
                lista.addElement(c);    
                }
            
            }
            jList1.setModel(lista);
        }
```

1. Primeiro vamos apagar o painel de erro, em seguida exibir o painel da lista.

2. Depois vamos fazer uma condicional caso o valor do passo positivo ou negativo.

	Se o passo for positivo, fazemos um laço `for` para que o programa "exiba" os valores de acordo com o passo e as variáveis colhidas dos sliders. A peculiaridade é que esse laço usa a condição do valor do `incremento` ser menor ou igual ao valor final para parar o loop.

	Se o passo for negativo, fazemos a mesma coisa, mas agora o valor do incremento deve ser maior ou igual ao valor final.

Após isso, fazemos com que a lista receba o modelo declarado anteriormente.

---

[[Java 23 - Estruturas de repetição (Laços)]]