Tags: #Ferramentas #Criando_e_configurando 

---
## 📝 Criando o projeto

Primeiro, no NetBeans, vamos fazer o seguinte.

- Novo projeto
- Java with Ant > JavaFX
- JavaFX XML Application
- Dar nome ao projeto
- Escolher a pasta do projeto
- Finish >

Após isso, o NetBeans criará um pacote com 3 arquivos.

![[img09_javafx.png]]

Vamos ver o que cada um deles é.
### ⚙ Classe

Uma classe, que nesse caso é o `OlaMundoJavaFX.java`, que terá o seguinte código criado automaticamente: 

```java
package pkg4.olamundojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OlaMundoJavaFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
```

Podemos ver que nas primeiras 7 linhas, o código importa várias <mark style="background: #7A6300;">bibliotecas externas</mark> do JavaFx.

E na linha 9 ele declara a classe pública `OlaMundoJavaFX` com <mark style="background: #7A6300;">herança</mark> de `Application`.

### 🔨 FXMLDocument.fxml

Se você instalou o JavaFX SceneBluider 2.0 corretamente, ao dar um duplo clique no arquivo `FXMLDocument.fxml`, abrirá a ferramenta de edição.

Ao abrir, teremos essa visualização:

![[img10_javafx1.png]]

Essa tela branca, que antes chamávamos de JFrame, agora chama-se AnchorPane, que dá no mesmo. Ele serve para qualquer tela, independente do dispositivo.

Nas cascatas do canto esquerdo, temos nossos Labels. Vamos arrastá-los de lá para nossa AnchorPane, assim como fizemos no swing.

![[img11_javafx2.png]]

Na cascata de `controls` encontramos Label e Button.

Ao clicar em uma dessas funcionalidades com o botão esquerdo do mouse, poderemos configurá-las no painel do canto direito.

Tudo muito parecido com o [[Java 5 - Swing]]

Para mudar o nome dos elementos, clicamos nele com o clique esquerdo, e em seguida, no canto inferior direito, abrimos a cascata `code`. Nela temos o campo `fx:id`, nele podemos renomear.

## ⚙ FXMLDocumentController.java

Como o nome já diz, esse arquivo contém configurações do documento, e o código em si.

Ao abri-lo, teremos o seguinte código.

```java
package pkg4.olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Arthur
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

```

Novamente, as primeiras linhas são importação de bibliotecas/pacotes.

Na declaração da classe (Linha 14), temos `implements`, que remete a <mark style="background: #7A6300;">interfaces</mark>. 

Dentro da classe pública `FXMLDocumentController`, temos a declaração dos Labels. Dentro das chaves, após o primeiro `@FXML` deveremos declarar nossos elementos que criamos anteriormente no editor. Ela vem assim:

```java
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

```

Devemos deixa-la assim:

```java
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem;
    private Button botaoClique;
    
     @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

```

Ao declarar os Labels nas linhas 4 e 5, aparecerá no contador de linhas do NetBeans uma lâmpada com exclamação de erro. Devemos clicar nela e aceitar a opção de importar o botão. Após isso, será adicionado mais um `import` no início do código.

Após isso, devemos ir no SceneBluider, selecionar o botão nos `Labels` (Canto inferior esquerdo), ir na cascata `code`, no canto inferior direito, e após abri-la, no campo `On Action`, devemos escrever o nome da nossa ação. No caso será "clicouBotao", utilizando o CamelCase.

Após isso deveremos salvar.

Agora configuraremos o `evento` no código, que deverá ficar assim:

```java
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem;
    private Button botaoClique;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá Mundo.");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
```

Na linha 8, colocamos o <mark style="background: #7A6300;">evento</mark>, e dentro dele o `.setText("Olá Mundo!")` assim como no Swing.

Após isso é só executar o programa, e ele funcionará perfeitamente igual ao anterior.

---
[[Java 6.1 - Como executar o .jar criado fora do NetBeans]]

[[Java 7 - Comentários]]
