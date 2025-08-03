Tags: #Sintaxe #Teoria #Métodos 

---
## 📦 Todos os tipos primitivos

Essa tabela contém todos os tipos primitivos em Java.

| Família  | Tipo primitivo | Wrapper Class |     Tamanho      |  Exemplo  |
| :------: | :------------: | :-----------: | :--------------: | :-------: |
|  Lógico  |    boolean     |    Boolean    |      1 bit       |   true    |
| Literais |      char      |   Character   |      1 byte      |    'A'    |
|    -     |       -        |    String     | 1 byte/caractere |  "JAVA"   |
| Inteiros |      byte      |     Byte      |      1 byte      |    127    |
|    -     |     short      |     Short     |     2 bytes      |   32767   |
|    -     |      int       |    Integer    |     4 bytes      |  2147483  |
|    -     |      long      |     Long      |     8 bytes      |   2^63    |
|  Reais   |     float      |     Float     |     4 bytes      | 3.4e^+39  |
|    -     |     double     |    Double     |     8 bytes      | 1.8e^+308 |

### Por que tantos tipos int?

Se você reparar bem, a maior diferença entre eles é a <mark style="background: #727272;">alocação de memória</mark>. Por exemplo, se uma variável vai receber um valor inteiro (int) de <mark style="background: #727272;">1 a 10</mark>, não faz sentido usar nenhum tipo além do `byte`, pois ele aloca até o número 127, reservando o mínimo espaço possível na memória, fazendo sua aplicação ser mais leve.

Economia de memória é muito importante no desenvolvimento Java. Leve em conta sempre o método mais otimizado para desenvolver boas aplicações.

---
## Comparando declarações de variáveis

Os tipos de texto ficam diferentes conforme a maneira que você declara.

```java
String nome1 = "Gustavo";
String nome2 = new String("Gustavo);
```

Essas duas strings serão diferentes se você compará-las usando um operador de igualdade, mas elas tem o conteúdo igual.

Para comparar o conteúdo das strings, existe um método que pode ser utilizado.

```java
nome1.equals(nome2)
```

Esse método `.equals()` serve para qualquer uma das Wrapperclasses, e retorna True ou False baseado nos conteúdos das variáveis, e não sobre suas estruturas.

---

[[Java 11 - Saída de dados em Java]]