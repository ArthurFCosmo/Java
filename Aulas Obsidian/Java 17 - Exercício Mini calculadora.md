Tags: #Criando_e_configurando #Sintaxe 

---

## 📦 Iniciando o projeto

Criamos sem o Maven novamente, usando o Swing. Vamos em > projeto Java com o Ant, sem classe principal, depois criamos o JFrame dentro do pacote.

## 🔨 Colocando elementos no JFrame

Deixei ele assim:
![[img15_swing4calc.png]]

- 1 Spinner numérico
- 1 Botão
- 1 Painel
- Vários labels

Coloquei um painel para ocultar e exibir posteriormente, e dentro dele coloquei os jLabels

Nomeei os jLabels vermelhos, pois são valores que serão mudados, e claro, nomeei o botão e o spinner.

Lembre de mudar o spinner para numérico!

## ⚙Configurando o código

### 1. Painel

Primeiro vamos fazer o painel iniciar oculto, e só aparecer ao clicar o botão.

Para isso, vamos no primeiro método dentro da classe (Esse método deve ter o mesmo nome da classe), criados pelo Swing.

```java
public class calculadora extends javax.swing.JFrame {

    public calculadora() {
        initComponents();
    }

```

Vamos adicionar a seguinte linha `jPanel1.setVisible(false);`, que serve para ocultar o painel.

### 2. Funcionalidades

Agora vamos para as funcionalidades dentro do método de apertar o botão.

```java
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        int num = Integer.parseInt(jSpinner1.getValue().toString());
        
        int resto = num % 2;
        int elevadoc = (int) Math.pow(num, 3);
        double raizq = Math.sqrt(num);
        double raizc = Math.cbrt(num);
        int valorab = Math.abs(num);
        
        rDivisao.setText(Integer.toString(resto));
        eCubo.setText(Integer.toString(elevadoc));
        rQuadrada.setText(Integer.toString((int) raizq));
        rCubica.setText(Integer.toString((int) raizc));
        vAbsoluto.setText(Integer.toString(valorab));
    }
```

Na linha 3 mudamos para `true` o método para exibir o painel.

Logo após, fizemos as conversões e os cálculos para exibir os valores.

Depois foi só dar `.setText()` nos labels vermelhos que nos criamos no começo.

---

[[Java 18 - Operador ternário]]