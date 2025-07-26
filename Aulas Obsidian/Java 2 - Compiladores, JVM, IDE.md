Assunto: #Teoria-Nerd

---
## Como funciona no geral
Para fazer um código funcionar na linguagem C, por exemplo, devemos criar um ==código fonte==, mas a máquina não entende esse código da maneira que é escrita por nós, então ele deve ser "traduzido" por um ==compilador==.

![[img01 compilador c.png]]

Porém, um compilador compila apenas para um tipo de máquina, por exemplo, um ==compilador Windows== traduz código-fonte para uma linguagem que apenas o Windows entende, desse jeito, se pegarmos um código compilado por um ==compilador Windows==, não poderíamos executa-lo numa máquina ==Linux== por exemplo, mesmo o código já estando compilado.

## Como funciona no Java
Já para fazer um código Java funcionar, além de passar por um ==compilador== Java (Chamado de ==JavaC==), o código deve passar por uma ==JVM== (Java Virtual Machine) antes de ser executado, pois mesmo o código-fonte Java já estando compilado, ele não é compreendido pela máquina, precisando passar pela JVM para ser executado corretamente.

![[img02 compilador java.png]]

Cada sistema deve ter sua ==JVM==, que já vem configurada automáticamente, apenas deve ser instalada. É ai que entra a vantagem do Java, o código compilado (Já passado pelo ==JavaC==) pode ser executado em qualquer sistema que já tenha sua ==JVM== instalada.

![[img03 jvms.png]]

Esse conceito se chama ==WORA==, write once run anywhere, escreva uma vez, execute em qualquer lugar.

## O que precisa ser instalado?
A empresa dona do Java divide as ferramentas em ferramentas para desenvolvedor, e ferramentas para usuário, para que o usuário não tenha que baixar o kit de desenvolvimento desnecessariamente, visto que ele não vai desenvolver, apenas utilizar aplicações Java.

- Para usuários, temos o ==JRE== (Ambiente de execução Java), que já vem com a ==JVM==.
- Para desenvolvedores, temos o ==JDK== (Kit de desenvolvimento Java), que já vem com o ==JRE== anexado, logo, também já vem com a ==JVM==.

![[img04 jdk-jre.png]]
# IDE

IDE's são ambientes personalizados para construir códigos. Elas tem vários plug-ins, que auxiliam você a ser um programador mais eficiente, seja completando suas palavras enquanto escreve, ou até criando código para você, além de ajudar a navegar entre arquivos, etc.

Para o Java, você pode usar o VSCode, mas ele é limitado na criação de exibição gráfica (Front-end), então você pode optar por usar o NetBeans + JavaFX, que te auxilia nesse aspecto. Porém o padrão para as empresas atualmente é usar o InteliJ.

Na IDE é importante que você configure corretamente qual versão da JVM você tem, e para qual versão você compilará o código, isso é relativamente simples de se fazer.


[[Java 3 - Criando o Olá mundo]]
