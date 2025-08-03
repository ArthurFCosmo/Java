Tags: #Teoria #Sintaxe #Métodos  

---
## Operadores básicos

Os operadores servem para manipular dados fazendo as operações matemáticas. São eles:

- Adição x + x
- Subtração x - x
- Multiplicação x * x
- Divisão  x / x
- Resto da divisão x % x 

A divisão decimal é feita com pontos, ao invés das vírgulas.

A ordem de procedência segue a ordem comum da matemática.

---
## Operadores Unários

- Incremento x++ (Adiciona 1 ao valor)
- Decremento x-- (Subtrai 1 do valor)

Os incrementos e decrementos podem ser usados depois do valor (x++) ou antes do valor (++x). Isso vai fazer com que o incremento seja feito antes ou depois do valor ser utilizado para cálculo. EX:

```java
int numero = 5
int valor = 5 + numero++
System.out.println(valor)
System.out.println(numero)
```

Ao executar esse código com pós incremento (x++), receberíamos os valores 10; 6; Pois como ele está com pós incremento, o incremento só é feito após o cálculo do valor. Mas se fizéssemos com o valor pre-incrementado (++x) ficaria assim:

```java
int numero = 5
int valor = 5 + ++numero
System.out.println(valor)
System.out.println(numero)
```

E teríamos o resultado 11; 6; Pois o pre-incremento funciona dessa forma, sendo adicionado no cálculo.

---
## Operadores de atribuição

Os operadores de atribuição são:

 `a += b` que significa a = a + b
 `a -= b` que significa  a = a - b
 `a *= b` a mesma coisa
 `a /= b` a mesma coisa
 `a %= b` a mesma coisa

---
## Classe Math

A classe math nos auxilia complementando a linguagem com operações matemáticas. Aqui vão as principais:

| PI     | Constante pi               | Math.PI         | 3,1415...   |
| ------ | -------------------------- | --------------- | ----------- |
| pow    | Exponenciação              | Math.pow(5,2)   | 25          |
| sqrt   | Raiz quadrada              | Math.sqrt(25)   | 5           |
| cbrt   | Raiz cúbica                | Math.cbrt(27)   | 3           |
| abs    | Valor absoluto             | Math.abs(-10)   | 10          |
| floor  | Arredondar pra baixo       | Math.floor(3.9) | 3           |
| ceil   | Arredondar pra cima        | Math.ceil(4.2)  | 5           |
| round  | Arredondamento aritmético  | Math.round(4.2) | 4           |
| random | Gera um número entre 0 e 1 | Math.random()   | 0.931929321 |
Macete para usar o random:

Para gerar um número entre x (maior) e y(menor):

`y + Math.random() * (x - y)`

---

[[Java 17 - Exercício Mini calculadora]]