Tags: #Sintaxe 

---
## 🔨 Declarando variáveis em Java

Vamos usar as seguintes variáveis em algoritmo como exemplo:

```
var
	idade: Inteiro
	salario: Real
	letra: Caractere
	aprovado: Logico

inicio
	idade <- 3
	salario <- 675.50
	letra <- "g"
	aprovado <- Falso
```

Agora, vamos ver como declara-las em Java.

## 1. Idade <- 3

### Primeira forma (Simples)

```java
int idade = 3;
```

Essa é a forma mais simples, declarando o tipo (`Int`, que faz referência a Integer, que significa inteiro), depois o nome da `variável`, e depois disso basta atribuir o `valor`.

---
### Segunda forma (Typecast)

No Java, o `tipo` é muito importante. Então às vezes, quando precisamos fazer tramitações entre tipos, precisamos fazer conversões ou especificações. Por exemplo, esse valor <mark style="background: #7A6300;">3</mark>, pode ser tanto real, quanto inteiro. Você pode especificar isso usando <mark style="background: #727272;">Typecast</mark>:

```java
int idade = (int) 3;
```

Veja que na hora de atribuir o valor, foi especificado que esse valor deve ser considerado como inteiro com o `(int)`, isso se chama <mark style="background: #727272;">Typecast</mark> e é muito útil ao criar variáveis.

---
### Terceira forma (Wrapper Class)

Aqui vamos usar uma técnica chamada 

```java
Integer idade = new Integer(3);
```

No código, `Integer` é uma <mark style="background: #7A6300;">classe</mark>, que é criada para podermos usar o <mark style="background: #7A6300;">método</mark> `new` (Que precisa ser referenciado por uma classe) para criar um <mark style="background: #7A6300;">objeto</mark>.

`new Integer(3)` Significa: novo objeto que recebe o valor: 3

---

Agora vamos continuar com as outras variáveis.
## 2. Salario <- 675.50

```java
float salario = 675.50f; // Primeira forma (Precisamos colocar um F no final)
float salario = (float) 675.50; // Typecast (Já não precisa mais do F)
Folat salario = new Float(675.50) // Wrapper class
```

## 3. Letra <- "g"

```java
char letra = 'g'; // Primeira forma
char letra = (char) 'g'; // Typecast
Character letra = new Character('g'); // Wrapper Class
```

O tipo `char` armazena <mark style="background: #727272;">apenas um caractere</mark>. Para podermos criar nomes precisamos armazenar diversos caracteres, mas não existe um tipo que faça isso. Apenas uma <mark style="background: #7A6300;">classe</mark>, que será citada depois.

## 4. Aprovado <- False

```java
boolean aprovado = false; // Primeira forma
boolean aprovado = (boolean) false; // Typecast
Boolean aprovado = new Boolean(false); // Wrapper class
```

Continuar da aula 6 minuto 12:00