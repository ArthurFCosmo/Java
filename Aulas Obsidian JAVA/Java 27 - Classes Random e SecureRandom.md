[](Java%2028%20-%20Strings.md)Tags: #Classes #Métodos 

---

# Para que servem

Essas classes servem para criar valores aleatórios.

A classe Random, cria padrões mais simples. Ideais para jogos e coisas menos sensíveis, pois seu processamento é mais rápido.

A classe SecureRandom cria padrões aleatórios mais complexos, sendo assim mais segura para criar tokens, senhas etc. Mas é mais lenta.

`import java.security.SecureRandom;` (Do pacote security)

`import java.util.Random;` (Do pacote util, um dos mais básicos)

# Método .nextInt()

Precisei dessas classes para criar uma "conta de banco", com um número aleatório. Usei a SecureRandom, instanciando um objeto para usar o método `.nextInt()`:

```java
SecureRandom random = new SecureRandom(); // Instanciando um objeto chamado "random" derivado da classe SecureRandom, para a partir dele poder usar um método.
random.nextInt(10) // Utilizando o método em questão
```

Na linha 1, nós fazemos os preparativos para poder usar o método da classe SecureRandom.

Na linha 2, usamos o método em questão, que recebe um número `int` como parâmetro, então ele retorna um número aleatório entre 0 e o número que você passou como parâmetro.

Usei então um laço, com a classe [[Java 28 - Strings]] + o método `.append()`, gerando vários números e enfileirando eles numa String, formando no fim um número de conta com 8 dígitos, depois adicionei um "-", e mais um dígito gerando pelo `.nextInt()`, formando assim a conta de banco.

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
```