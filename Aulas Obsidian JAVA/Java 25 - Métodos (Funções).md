Tags: #Teoria #Sintaxe #Métodos 

---

## Procedimentos em algoritmo

Procedimentos servem para resumir blocos de códigos que se repetem várias vezes no programa.

Em algoritmo, são declarados assim:
```
Procedimento Soma(A, B: Inteiro)

var

S: Inteiro

Inicio

S <- A + B
Escreva(S)

FimProcedimento

--------------------------------

Inicio

Soma (5,2)

Fimalgoritmo
```

Nesse procedimento, recebemos dois parâmetros, A e B, e depois, em seu corpo, ele realiza a soma dos valores, que é o procedimento. Após isso ele escreve a soma, e <mark style="background: #7A6300;">não retorna nada ao usuário</mark> além do print.

## Métodos em Java

No Java, temos uma palavra que significa que algo não retornará nada ao programa, essa palavra chama-se `void`. Usaremos ela para declarar o método. Exemplo:

```java
void soma (int A, int B) {
	int S = A + B;
	System.out.println(S)
}

soma(5,2);
```

## Funções em algoritmo

No algoritmo, tínhamos procedimentos que retornavam valores, eles eram chamados de funções, eles funcionam assim:

```
Funcao Soma(A, B: Inteiro): Inteiro

var

S: Inteiro

Inicio

S <- A + B

Retorne S

FimFuncao

--------------------------------

Inicio

R <- Soma (5,2)

escreva(soma)

Fimalgoritmo
```

Poderíamos atribuir o valor do resultado de uma função a uma variável. Veja que no final da declaração da função temos : `Inteiro`, isso é o tipo do valor de retorno.

## Funções no Java

No Java, para definir uma função com retorno, basta tirar o `void`, e no lugar dele colocar o tipo primitivo do valor que será retornado pela função. Exemplo:

```java
 int soma (int A, int B) {
	int S = A + B;
	return S;
}

int sm = soma(5,2);
```

Podemos identificar se um método terá retorno ou não pela presença da palavra `void` ou do tipo primitivo declarado antes da função.

## Como usar no projeto

No Java, você deve declarar seus métodos antes do método principal `public static void main`, e você só poderá usa-lo dentro do seu método main, se você declará-lo como estático também.

Você não pode declarar um método não-estático (Seu método criado), dentro de um método estático (Sua classe principal `public static void main`).

Então, devemos declarar como estático, ficando assim:

```java
static int soma (int A, int B) {
	int S = A + B;
	return S;
}


public static void main(String[] args){

	int sm = soma(5,2);
	System.out.println("A soma vale" + sm)
	
}
```

## Como usar um método declarado em outra classe

Você pode criar vários arquivos de classe no seu projeto Java. Você pode ter um arquivo para os controladores e visualização do seu código, e um para conter apenas os métodos.

Para chamar métodos de outra classe, basta colocar `nome_da_classe.método(parâmetros)`, como no exemplo a seguir:

Arquivo com o método:

```java
public class Operacoes {
    static int soma(int v1, int v2){
        int S = v1 + v2;
        return S;
    }
}
```

Veja, dentro da classe declaramos o método, e o tornamos estático, pois usaremos ele dentro da nossa classe principal (no outro arquivo), que também é um método estático (`public static void main`)

Arquivo com a classe principal (programa):

```java
public class Metodos {
    public static void main(String[] args) {
        
        System.out.print("Insira o primeiro valor a ser somado: ");
        Scanner teclado = new Scanner(System.in);
        int v1 = teclado.nextInt();
        
        System.out.print("Insira o segundo valor: ");
        int v2 = teclado.nextInt();
        
        System.out.println("O resultado da soma e: " + Operacoes.soma(v1, v2));
    }
}
```

---

[[Java 26 - Exceptions]]