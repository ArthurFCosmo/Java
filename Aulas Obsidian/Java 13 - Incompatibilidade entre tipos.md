Tags: #Sintaxe #Métodos #Estratégias

___
## ⚠ String e Int

Podemos encontrar problemas ao tentar combinar dados de tipos diferentes. Por exemplo:

```java
int idade = 30;
String valor = idade;
```

Nesse código, estamos tentando fazer com que uma `string` receba um valor de uma variável `int` declarada anteriormente. Isso não é possível no Java, pelo menos não dessa forma.

Para converter, devemos usar WrapperClass com um método novo. Veja:

## Exemplo 1

```java
int idade = 30;
String valor = Integer.toString(idade);
```

O código da linha 2 acontece da direita pra esquerda. Primeiro ele pega o valor de idade e transforma em `string`, após isso ele coloca esse resultado dentro da variável valor (do tipo `string`).

Pronto, assim funcionará. O número 30 `int` será convertido para `string`.

## Exemplo 2

Podemos fazer o contrário também, transformar uma variável `string` em `int`.

```java
string idade = '30';
int valor = Integer.parseInt(idade)
```

## Exemplo 3

Também podemos mudar para `float`.

```java
string preco = '2.50'
float valor = Float.parseFloat(preco)
```
