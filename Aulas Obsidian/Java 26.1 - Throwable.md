Tags: #Corrigindo_erro #Teoria 

---

## 1. O que é `Throwable`?

`Throwable` é a **superclasse** de todos os erros e exceções em Java.

👉 Isso significa que **todo erro ou exception no Java herda de `Throwable`**.

Estrutura simplificada da hierarquia:

Object    
    └── Throwable          
	    ├── Error          
		└── Exception                
			    └── RuntimeException

---

## 2. Os dois grandes "filhos" de `Throwable`

1. **Error**
    
    - São problemas sérios do sistema, que você normalmente **não consegue ou não deve tratar**.
        
    - Exemplo: `OutOfMemoryError` (falta de memória), `StackOverflowError`.
        
    - Geralmente indicam falha na JVM ou no ambiente.
        
2. **Exception**
    
    - São problemas que **o programador pode e deve tratar**.
        
    - Exemplo: divisão por zero (`ArithmeticException`), índice inválido (`ArrayIndexOutOfBoundsException`), falha ao abrir arquivo.
        

Dentro de `Exception`, temos:

- **Checked exceptions** (obrigatório tratar, como `IOException`)
    
- **Unchecked exceptions** (herdam de `RuntimeException`, não obrigatórias, como `NullPointerException`)
    

---

## 3. Para que serve `Throwable`?

- Ele é a **raiz comum** para capturar qualquer problema no Java.
    
- Você pode escrever um `catch (Throwable e)` para capturar **qualquer coisa** (tanto `Error` quanto `Exception`).
    

Exemplo:

```java
public class TesteThrowable {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]); // Erro
        } catch (Throwable t) {
            System.out.println("Algo deu errado: " + t);
        }
    }
}
```

Saída:

`Algo deu errado: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3`

---

## 4. Métodos importantes de `Throwable`

- `getMessage()` → retorna a mensagem de erro.
    
- `printStackTrace()` → mostra a pilha de chamadas (muito usado para debug).
    

Exemplo:

```java
try {
    int x = 5 / 0;
} catch (Throwable t) {
    System.out.println("Mensagem: " + t.getMessage());
    t.printStackTrace();
}
```

Saída:

`Mensagem: / by zero java.lang.ArithmeticException: / by zero     at TesteThrowable.main(TesteThrowable.java:4)`

---

✅ Resumindo:

- `Throwable` é a **classe-mãe** de todos os erros e exceções em Java.
    
- Ele se divide em duas grandes categorias: `Error` (não tratáveis) e `Exception` (tratáveis).
    
- Você pode capturar qualquer problema com `catch (Throwable e)`, mas na prática é mais comum capturar **Exceptions específicas** ou `Exception` em geral.