Tag: #Criando_e_configurando #xml

## Possível erro

Na primeira vez que criei um <mark style="background: #727272;">JFrame</mark>, meu <mark style="background: #727272;">Maven</mark> estava rodando uma classe incorreta, que nem existia.

[[Java 5.1.1 - Maven]]

Acidentalmente eu tinha criado dois pacotes, e o nome da minha <mark style="background: #7A6300;">classe</mark> estava diferente do nome do <mark style="background: #7A6300;">projeto</mark>, o que estava confundindo o Maven na hora de executar o código.

![[img08_pacote-incorreto.png]]

Veja que além dos nomes do <mark style="background: #7A6300;">projeto</mark> e da <mark style="background: #7A6300;">classe</mark> estarem diferentes, existia um <mark style="background: #7A6300;">pacote</mark> *olamundoswing* que estava sobrando.

Para corrigir isso,  comecei deletando o <mark style="background: #7A6300;">pacote</mark> <mark style="background: #727272;">olamundoswing</mark>.

Após isso, fui configurar o <mark style="background: #727272;">POM.xml</mark> que fica dentro da pasta <mark style="background: #727272;">Project Files</mark>, que é o arquivo que funciona como o gerenciador do Maven no projeto.

Ele estava assim:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.mycompany</groupId>
	<artifactId>2.OlamundoSwing</artifactId>
	<version>1.0-SNAPSHOT</version> 
	<packaging>jar</packaging>
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<maven.compiler.source>21</maven.compiler.source>
		<maven.compiler.target>21</maven.compiler.target>

		<!-- DEFINIÇÃO INCORRETA DE CLASSE --> 
		
		<exec.mainClass>olamundoswing.App</exec.mainClass> 

		<!-- DEFINIÇÃO INCORRETA DE CLASSE --> 
	</properties>
</project>
```

Precisei adicionar algumas linhas para que o Maven pudesse reconhecer a classe <mark style="background: #7A6300;">OlaMundoJava</mark>, ficando assim:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.mycompany</groupId>
    <artifactId>2.OlamundoSwing</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
    </properties>

		<!-- BLOCO DE CÓDIGO NOVO PARA DEFINIR A MAIN CLASS --> 
		
    <build>
        <plugins>
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>exec-maven-plugin</artifactId>
                <version>3.1.0</version>
                <configuration>
                    <mainClass>cursoemvideo.olamundo.OlaMundoJava</mainClass>
                </configuration>
            </plugin>
        </plugins>
    </build>

		<!-- BLOCO DE CÓDIGO NOVO PARA DEFINIR A MAIN CLASS --> 
		
</project>
```

Após isso, bastou clicar com o botão direito no <mark style="background: #7A6300;">projeto</mark> e clicar em <mark style="background: #727272;">clean and bluid</mark>. Assim ele recompila tudo da maneira correta com as novas configurações.

[[Java 5 - Swing]]