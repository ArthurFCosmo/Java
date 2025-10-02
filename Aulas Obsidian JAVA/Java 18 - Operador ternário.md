Tags: #Sintaxe #Métodos 

---

## Como funciona?

O operador ternário é uma estrutura condicional simples, que funciona da seguinte forma:

`expressao ? x : y`

Primeiro vem uma <mark style="background: #727272;">expressão</mark>, logo após um sinal de <mark style="background: #727272;">interrogação</mark>. No valor de X, é o que o operador vai retornar caso a expressão antes da interrogação seja <mark style="background: #727272;">verdadeira</mark>. No valor de Y, o que deverá ser retornado caso a expressão seja <mark style="background: #727272;">falsa</mark>.

Vamos com um exemplo de código:

```java
int n1, n2;

n1 = 5;
n2 = 3;

r = n1 > n2 ? n1 : n2;

System.out.print(r)
```

Você também pode colocar um dentro do outro, no espaço depois dos dois pontos, você pode colocar outro teste para caso o primeiro seja falso. Ex:

```java
String permissao = idade >= 18 ? "Pode votar" : idade >= 16 ? "Opcional": "Nao pode votar";
```

Esse exemplo funciona da seguinte forma: Se tiver 18 ou mais, pode votar. Se não tiver, mas tiver 16 ou mais, voto opcional. Se não tiver nenhum dos dois, não pode votar.

---

[[Java 19 - Operadores relacionais]]
