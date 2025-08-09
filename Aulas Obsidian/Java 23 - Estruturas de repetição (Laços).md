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

Exemplo de cálculo de fatorial usando o laço while:

```java

// Coletar o valor

Scanner teclado = new Scanner(System.in);

System.out.print("Insira o valor: ");
int valor = teclado.nextInt();
System.out.println(valor);

// Calcular o fatorial

int f = 1;

while (valor >= 1){
	f *= valor;
	valor--; 
}

// Mostrar o resultado na tela

System.out.println("Valor: " + soma);
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
} while (X < 10);
```

É possível usar os comandos `continue` e `break` nesse tipo de laço normalmente.

Código de fatorial com o laço do:

```java
// ler o valor
               
System.out.print("Insira o valor: ");
Scanner teclado = new Scanner(System.in);
int valor = teclado.nextInt();

// calcular o fatorial

int soma = 1;

do {
	soma *= valor;
	--valor;
} while (valor >= 2);

// esrevendo o valor na sela

System.out.println("Valor do fatorial: " + soma);
```

Veja que a condição de parada é o valor ser maior ou igual a 2, por que como o teste lógico vai ser após a mudança do incremento, devemos acabar o laço antes, visto que ele vai fazer uma vez a mais por causa desse propriedade.

---

## 3. Laço for (para)

O laço `for` é um pouco diferente, ele já vem com o incremento (contador), e geralmente é utilizado quando já se sabe previamente o número de repetições que o bloco vai receber. A estrutura é a seguinte:

```java
for (int X=0; X <= 3; X++){
	Y
}
```

Nessa linha, temos o comando `for`, o primeiro parâmetro passado dentro dos parênteses é o <mark style="background: #727272;">contador</mark>, que declaramos livremente da mesma forma que declararíamos fora do laço. Após isso, temos o segundo parâmetro, que é a <mark style="background: #727272;">condição de parada</mark> do laço. Por último temos o incremento (passo).

Exemplo de cálculo de fatorial usando o laço for:

```java

// Coletar o valor

Scanner teclado = new Scanner(System.in);

System.out.print("Insira o valor: ");
int valor = teclado.nextInt();
System.out.println(valor);

// Calcular o fatorial

int soma = 1;

for (int C = valor; C > 1; C--) {
	
	soma *= C ;
	System.out.println(soma);
}

// Mostrar o resultado na tela

System.out.println("Valor: " + soma);
```

