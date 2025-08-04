Tags: #Criando_e_configurando #Métodos #Sintaxe 

---

## 📦 Iniciando o projeto

Criamos sem o Maven novamente, usando o Swing. Vamos em > projeto Java com o Ant, sem classe principal, depois criamos o JFrame dentro do pacote.

## 🔨 Colocando elementos no JFrame

Deixei ele assim:
![[img17_swing6bhaskara.png]]

- 3 Jspinners
- 1 Botão
- 3 Labels variáveis (vermelhos)
- 1 Jpannel com 2 Labels variáveis (azuis)

Para colocar esses símbolos usei tags HTML, como por exemplo: `<html>Calcular &Delta;</html>`
## ⚙Configurando o código

### 1. Valores em tempo real

Primeiro vamos fazer com que os valores mudem ao serem modificados nos spinners.

Para isso, basta ir no spinner > clique direito > events > change > stateChanged; Isso abrirá o código fonte.

Nele, vamos inserir a linha: `jB.setText(jSb.getValue().toString());` para mudar o label vermelho assim que o spinner mudar também.

```java
    private void jSbStateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        jB.setText(jSb.getValue().toString());
    }             
```

Vamos fazer isso para todos os spinners + labels vermelhos.

### 2. Painel

Agora vamos fazer o painel iniciar oculto, e só aparecer ao clicar o botão.

Para isso, vamos no primeiro método dentro da classe (Esse método deve ter o mesmo nome da classe), criados pelo Swing.

```java
public Bhaskara() {
        initComponents();
    }

```

Vamos adicionar a seguinte linha `jPanel1.setVisible(false);`, que serve para ocultar o painel.

Para exibi-lo depois, basta adicionar a linha `jPanel1.setVisible(true);` ao bloco de código de ação do botão.

### 3. Botão

Para configurar as ações da aplicação, usamos as seguintes linhas:

```java
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        
        int B, A, C;
        A = Integer.parseInt(jSa.getValue().toString());
        B = Integer.parseInt(jSb.getValue().toString());
        C = Integer.parseInt(jSc.getValue().toString());
        
        int valordedelta = (int) ((Math.pow(B, 2)) - 4 * A * B);
        jDelta.setText(Integer.toString(valordedelta));
        
        if (valordedelta < 0) {
            jRaiz.setText("Não existem raízes reais.");
        } else {
            jRaiz.setText("Existem raízes reais");
        }
    }                                        
```

Na linha 10 usamos o método `Math.pow` para calcular a potenciação no cálculo de delta.

--- 

[[Java 22 - Estruturas condicionais]]