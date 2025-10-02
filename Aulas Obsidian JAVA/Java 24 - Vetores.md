Tags: #Teoria #Sintaxe #Métodos 

---

## Como funcionam os vetores em Java?

Assim como no Portugol, podemos declarar variáveis multidimensionais, que recebem vários valores.

No algoritmo declararíamos assim:

```
x(0..3) de inteiro

x[0] <- 1
x[1] <- 2
x[2] <- 3
x[3] <- 4
```

No Java, vamos declarar esse mesmo vetor assim:

```java
int x[] = new int[4]
```

No Java, a primeira posição de um vetor é sempre 0.

Agora vamos colocar valores dentro do vetor no Java:

```java
int x[] = new int[4]
n[0] = 1;
n[1] = 2;
n[2] = 3;
n[3] = 4; 
```

Podemos usar uma sintaxe ainda mais simples para declarar os mesmos valores:

```java
int n[] = {1, 2, 3, 4};
```

## Atributos

Um vetor é um objeto, então ele recebe métodos.

`vetor.length;` = mostra a quantidade de índices (valores) dentro do vetor

`Arrays.sort(vetor);` = Coloca o vetor em ordem

`Arrays.binarySearch(vetor, valor_procurado);` = Busca um valor, e retorna o índice. Se o valor não existir, retorna um valor negativo (Não existem índices negativos)

`Arrays.fill(vetor, valor);` = Preenche todos os índices do vetor com um valor único e igual.
## Exibindo esses valores com laços

Para exibir os valores do exemplo anterior, podemos usar o seguinte laço:

```java
int n[] = {1, 2, 3, 4};

for (int c = 0; c <= 5; c++) {
	System.out.println(n[c])
}
```

No caso, mandamos ele dar um print do índice `c` do vetor `n` várias vezes.

Usando o `length`, podemos melhorar a declaração esse laço:

```java
int n[] = {1, 2, 3, 4};

for (int c = 0; c <= n.length - 1; c++) {
	System.out.println(n[c])
}
```

Podemos exibir esse valor com o `for each`, que é bem melhor. Funciona assim:

```java
int n[] = {1, 2, 3, 4};

for (int valor : n) {
	System.out.println(valor)
}
```

Com o uso desse tipo de laço, recebemos uma variável com o valor dentro de cada índice por vez, dispensando a declaração `n[c]`.

---

[[Java 24.1 Exercício lista de vetor]]




