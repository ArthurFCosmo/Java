Tags: #Sintaxe #Métodos #Teoria 

---

## O que são?

Estruturas de repetição, como o nome diz, são feitas para repetir blocos de códigos que normalmente teriam que ser digitados várias vezes.

## 1. Laço while (Enquanto)

O laço `while` é uma estrutura de repetição com teste lógico no início, ou seja, quando se abre o laço, se faz um teste lógico, e o bloco de código se repete até o teste lógico se tornar verdadeiro.

A estrutura do `while` no Java se dá assim:

```java
while (X) {
	Y
}
```

Dentro do laço, podemos usar outras estruturas.

### Break

O break serve para parar o loop antecipadamente, ele pode ser usado com uma condição.

```java
int X = 0;

while (X < 10) {
	X++;
	System.out.println(X);
	if (X == 7) {
		break
	}
}
```

Nesse caso, o laço vai somando na variável de teste, quando ela chega em 7 o laço quebra e o código segue.

### Continue

O continue serve para pular uma parte do loop, e pode ser usado com condições também.

```java
int X = 0;

while (X < 10){
	X++;
	if (X == 7) {
		continue
	}
	System.out.println(X)
}
```

Nesse caso, o código daria print em todos os números, mas no 7, ele pularia e continuaria o laço.

---

## 2. Laço do (faça)

O laço `do` funciona como o `while`, só que tem o teste lógico no final:

```java
int X = 0;

do {
	X++;
	System.out.println(X)
} while (X < 10)
```

