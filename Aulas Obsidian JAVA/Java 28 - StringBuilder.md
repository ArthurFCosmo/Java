Tags: #Classes #Métodos 

---

# Para que serve

Essa classe serve para manipular Strings, e como o nome diz, criá-las.

Essa classe é muito útil para não ter que ficar declarando vários objetos String na memória, montando eles antes, e só depois declarando-os.

Pertence ao pacote `java.lang`, esse pacote já vem importado automaticamente.

# Método .append()

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


# Exemplo prático

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