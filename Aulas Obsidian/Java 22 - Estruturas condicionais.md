Tags: #Sintaxe #Métodos 

---

## 🚩 If ("Se" do Portugol)

Temos diversas estruturas condicionais, uma dela é o `if`.

O `if` funciona da seguinte forma:

```java
if X {
	Y;
} else {
	Z;
}
```

Ao digitar blocos de código não se usa o `;`, apenas abre e fecha-se chaves. Mas nos comandos dentro dos blocos, usa-se `;`.

Teremos o `if`, seguido de uma condição, que poderá ser uma expressão, no caso `X`. Após isso, teremos uma abertura de chaves, que será um bloco de código. Se a condição `X` for verdadeira, será executado  `Y`. Após esse bloco, logo após o fechamento de chaves na mesma linha, teremos o `else {},` que receberá o bloco de código que será executado caso a condição de X seja falsa, executando `Z`. 

Dentro dos blocos usamos indentação. 

```java
int valor = 4;
int teste = 5;

if valor > teste {
	System.out.print(valor + "É maior que" + teste);
} else {
	System.out.print(teste + "É maior que" + valor);
}
```

Funcionando dessa forma.

Aqui vai um exemplo de uso dessa estrutura em uma aplicação Swing que eu criei nos meus exercícios.

```java
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {              
        int valor = Integer.parseInt(jTextField1.getText());
        
        if (valor % 2 == 0) {
            jResultado.setText(valor + " É par!");
        } else {
            jResultado.setText(valor + " É ímpar!");
        }
    }        
```

Vamos para um exercício de exemplo antes de continuar.

[[Java 22.1 - Exercício Bhaskara IF]]

---

## 🗃 Condicionais aninhadas

Em uma situação com muitas possibilidades, podemos utilizar várias condicionais dentro de uma só, onde o `else` do `if` se torna outro `if`. Por exemplo:

```java
if x > 10 {
	...
} else {
	if x == 10 {
		...
	} else {
		...
	}
}
```

No caso, se `X` for maior que 10, acontece algo. Se `X` for igual a 10, acontece outra coisa. E por fim, se `X` for menor do que 10 (`else`), acontece outra coisa diferente. São 3 possibilidades, com esse <mark style="background: #727272;">aninhamento</mark> podendo ser infinitamente estendido.

Isso em um código retirado de um exercício Swing que eu desenvolvi fica assim:

```java
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        
        int anonasc = Integer.parseInt(jSpinner1.getValue().toString());
        int idade = 2025 - anonasc;
        
        jIdade.setText(Integer.toString(idade));
        
        if (idade < 16) {
            jResposta.setText("Não pode votar!");
        } else {
            if ((idade >= 16 && idade < 18) || idade > 70){
                jResposta.setText("Voto opcional");
        } else {
            jResposta.setText("Voto obrigatório!");
            }
        }
    }                                        
```

Nesse caso também temos 3 possibilidades, voto obrigatório, voto opcional e voto negado. Para isso, usamos 3 condições <mark style="background: #727272;">aninhadas</mark>.

Como você pôde ver, ficam abrindo-se vários blocos de código, devido ao aninhamento, como pastas umas dentro das outras. Podemos amenizar isso com a estrutura `else if`. No código, temos `else` que não terminam e se tornam outro `if`, podemos juntá-los, deixando o código assim:

```java
	if (idade < 16) {
		jResposta.setText("Não pode votar!");
		} else if (idade < 16 || idade >= 18 && idade <= 70){
			jResposta.setText("Voto obrigatório!");
		} else {
			jResposta.setText("Voto opcional");
		}                                            
```

---

## 🕹 Switch ("Escolha" do Portugol)

Para uma única variável com diversas condições, temos a estrutura `switch`, que funciona da seguinte maneira:

```java
switch (X) {
            case 1:
                tipo = "Mínimo";
                break;
            case 2:
                tipo = "Pouco";
                break;
            case 3:
                tipo = "Ideal";
                break;
            case 4:
                tipo = "Muito";
                break;
            case 5:
                tipo = "Máximo";
                break;
            default:
                tipo = "Inválido"; 
        }
```

Nesse exemplo, temos uma variável `pernas`, que dependendo do seu valor, "recebe um tipo" diferente.

Em situações como essas, convém usar o `switch`, que pode conter várias condições, que são iniciadas com `case`, recebem um bloco de código, e no fim do bloco recebem um `break`, que leva para o fim do `switch`.

Também temos a seguinte forma de estruturar o switch, mais resumida:

```java
tipo = switch (X) {
            case X == 1 -> "Mínimo";
            case X == 2 -> "Pouco";
            case X == 3 -> "Ideal";
            case X == 4 -> "Muito";
            case X == 5 -> "Máximo";
            default -> "Inválido";
        };
```

Switch não funciona com números reais, só com inteiros.

---

