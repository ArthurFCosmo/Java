Tags: #Classes #Métodos 

---


# Método .length()

Retorna a quantidade de caracteres de uma String. Ex:

```java
String x = "Arthur...Cosmo"
System.out.println(x.length())
// O resultado será 14
```

# Método .contains()

Checa se dentro de uma String existe algo em específico, que é passado como parâmetro. Esse parâmetro também deve ser caractere. O método retornará um valor boolean. Ex:

```java
String x = "Olá, tudo bem?"
System.out.println(x.contains("tudo"))
// O resultado será True
```

# Método .indexOf()

Recebe um valor String, uma palavra, e retorna o índice em que se encontra o primeiro caractere daquela palavra em questão. Ex:

`Os índices sempre começam com 0, ele é contado.`

```java
String x = "Olá, tudo bem?"
System.out.println(x.indexOf("tudo"))

// Contagem de index:
// Olá, tudo...
// 0123456789
// O resultado será 5
```

# Método .toUpperCase()

Transforma todos os caracteres da String, e transforma em letra maiúscula.

# Método .toLowerCase()

Transforma todos os caracteres da String, e transforma em letra minúscula.

# Método .trim()

Esse método remove todos os espaços antes e depois da String, apenas os desnecessários, mantendo os demais. Ex:

```java
String x = "   Olá, tudo bem?  "
System.out.println(x.trim())
// O resultado será:"Olá, tudo bem?"
```

# Método .substring()

Esse método recebe um índice como parâmetro, e retorna tudo a partir daquele índice. Ex:

```java
String x = "Olá, tudo bem?"
System.out.println(x.substring(5))
// O resultado será: "tudo bem?"
```

Esse método pode também receber dois parâmetros (dois índices), um de início, e um de fim, criando um intervalo. Ex: 

```java
String x = "Olá, tudo bem?"
System.out.println(x.substring(5,9))
// O resultado será: "tudo"
```

# Método .replace()

Esse método recebe duas Strings como parâmetro, uma como alvo, e outra como substituto. Ele localiza as Strings equivalentes ao alvo, e troca pela string Substituta. Ex:


```java
String x = "A M A N D A"
System.out.println(x.replace("A", "X"))
// O resultado será: "X M X N D X"
```

---
# Método .replaceAll()

 Esse método é mais complexo que o .replace(), pois recebe como primeiro parâmetro uma regex (Regular expression,  expressão regular, em português), e uma String como segundo parâmetro, que servirá como substituta assim como no .replace().

Ex. do método .replace() e o .replaceAll() fazendo a mesma coisa:

```java
String texto = "Java é legal";
String resultado = texto.replace("a", "o");
// O resultado será: "Jovo é legol"
```

```java
String texto = "Java é legal";
String resultado = texto.replaceAll("a", "o");
// O resultado também será: "Jovo é legol"
```

Exemplo onde a diferença importa:

```java
String texto = "Java123";
texto.replace("[0-9]", "");
// Não remove nada, pois trata "[0-9]" como texto literal.
```

```java
String texto = "Java123";
String resultado = texto.replaceAll("[0-9]", "");
// O resultado será: "Java"
// Pois o .replaceAll reconhece a expressão [0-9] como "Todos os números de 0 a 9"
```

## Exemplo prático:

Como posso remover todos os caracteres que não são números usando o `.replaceAll()`?

### Forma mais moderna (recomendada)

`String apenasNumeros = texto.replaceAll("\\D", "");`

- O que significa `\D`?

- `\d -> qualquer número (0–9)`
- `\D → qualquer coisa que NÃO seja número`

⚠️ Em Java, a barra precisa ser **escapada**, por isso `\\D`.

```java
String texto = "Tel: (11) 9-8765-4321";
String apenasNumeros = texto.replaceAll("\\D", "");
// O resultado será: "11987654321"
```
### Forma mais complexa 

- Para remover **todos os caracteres que NÃO são números** usando **`.replaceAll()`**, você deve usar **regex com negação**.

```java
String texto = "Tel: (11) 9-8765-4321";
String apenasNumeros = texto.replaceAll("[^0-9]", "");
// O resultado será: "11987654321"
```

Na regex:

`[] -> Classe de caracteres`
`^ dentro de [] - > Negação`
`0-9 -> Dígitos de 0 a 9`

---

# Método .equals()

Esse método recebe uma String, como parâmetro, e retorna um boolean. Ele serve para testar equivalência entre a String alvo, e a String passada como parâmetro. Ex:

- Por que não usar `X == Y`?

As vezes, as Strings podem ter o mesmo conteúdo, mas o == não compara o conteúdo, ele compara a referência dos objetos. Elas podem ter o mesmo conteúdo, mas serem dadas como diferentes por terem sido alocadas em espaços de memória diferente.

```java
String x = "Olá, tudo bem?"
System.out.println(x.equals("Olá, tudo bom?"))
// O resultado será: False
```

---
# StringBuilder

Essa classe serve para manipular Strings, e como o nome diz, criá-las.

Essa classe é muito útil para não ter que ficar declarando vários objetos String na memória, montando eles antes, e só depois declarando-os.

Pertence ao pacote `java.lang`, esse pacote já vem importado automaticamente.

## Método .append()

Podemos montar a String usando o `+` como por exemplo:

```java
String s = "1";
s = s + "Numero um";
```

Mas como foi citado anteriormente, isso não é muito inteligente.

Podemos usar esse método para adicionar conteúdo a uma String, montando ela por pedaços, como se fosse um LEGO. Ex:

```java
StringBuilder sb = new StringBuilder();
sb.append("1");
sb.append("2");
sb.append("3");
```


## Exemplo prático

```java
// criando conta aleatoria
            SecureRandom random = new SecureRandom();
            StringBuilder codigo = new StringBuilder();

            for (int i = 0; i < 8; i++) {
                codigo.append(random.nextInt(10));
            }
            
            codigo.append("-");
            codigo.append(random.nextInt(10));

            String resultado = codigo.toString();
        this.conta = resultado;
    }
```

Usei esse código para criar um número de conta de banco aleatório em um projeto. Ele consiste em usar o método `random.nextInt()` da classe [[Java 27 - Classes Random e SecureRandom]] para criar um número aleatório, e dar `.append()` desse valor em uma String, tudo isso dentro de um laço. Como resultado, temos uma String com 8 dígitos aleatórios.

Logo após, damos `.append()` em um "-", e depois mais um número aleatório, para ficar como aquele dígito separado que temos em conta de banco.

