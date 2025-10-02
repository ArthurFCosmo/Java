Tags: #Corrigindo_erro #Teoria 

---

## 1. O que é uma _exception_?

Em português, _exception_ significa **exceção**.  
Na programação, uma exceção é um **erro que acontece enquanto o programa está rodando**.

Exemplo do dia a dia:

- Imagine que você vai dividir uma conta no restaurante e pede a calculadora para dividir R$ 100 por 0.
    
- Isso não faz sentido matematicamente → gera um erro.  
    Esse tipo de erro em Java é tratado como uma **Exception**.
    

Ou seja:  
👉 Exceptions são **situações anormais/inesperadas** que interrompem o fluxo normal do programa.

---

## 2. Tipos de erros em Java

Antes de falar de exceptions, é bom diferenciar:

1. **Erros de compilação**
    
    - O código nem compila (escreveu `Sysem.out.println` em vez de `System.out.println`).
        
    - Esses erros o próprio compilador aponta.
        
2. **Erros de execução (exceptions)**
    
    - O código compila, mas dá problema **enquanto roda**.
        
    - Exemplo: acessar um índice inexistente de um array, dividir por zero, converter uma letra em número.
        

---

## 3. Exemplo simples de uma exception

```java
public class TesteException {
	public static void main(String[] args) {
	int a = 10;
	int b = 0;
	
	int resultado = a / b; // 🚨 Aqui dá erro (ArithmeticException)
	
	System.out.println("Resultado: " + resultado);     } }
```

Se você rodar, vai aparecer:

`Exception in thread "main" java.lang.ArithmeticException: / by zero`

---

## 4. Como tratar exceptions em Java

Em Java, usamos o **try-catch** para capturar e lidar com exceptions.

### Exemplo corrigido:

```java
public class TesteException {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
		int resultado = a / b; // Pode dar erro
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Erro: não é possível dividir por zero!");
		}
		
		System.out.println("O programa continua rodando normalmente...");     
	} 
}
```

Saída:

`Erro: não é possível dividir por zero! O programa continua rodando normalmente...`

👉 Repare que agora o programa **não para**, porque tratamos a exception.

---

## 5. Estrutura do `try-catch-finally`


```java
try {
    // Código que pode gerar erro
} catch (TipoDaException e) {
    // O que fazer se o erro acontecer
} finally {
    // (Opcional) sempre executa, com ou sem erro
}
```

Exemplo com `finally`:

```java
try {
    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]); // Erro: índice inválido
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Erro: índice fora do limite!");
} finally {
    System.out.println("Fim do programa.");
}
```

---

## 6. Tipos comuns de exceptions

- **ArithmeticException** → divisão por zero.
    
- **NullPointerException** → tentar acessar algo que é `null`.
    
- **ArrayIndexOutOfBoundsException** → acessar índice inexistente no array.
    
- **NumberFormatException** → converter texto que não é número.
    

---

## 7. ⚠️ Checked vs Unchecked exceptions ⚠️

Esse conceito é importante:

- **Checked exceptions** → O compilador **obriga** você a tratar.
    
    - Exemplo: abrir um arquivo que pode não existir.
        
- **Unchecked exceptions** → Erros mais comuns, você não é obrigado a tratar, mas pode.
    
    - Exemplo: dividir por zero.

---

[[Java 26.1 - Throwable]]
