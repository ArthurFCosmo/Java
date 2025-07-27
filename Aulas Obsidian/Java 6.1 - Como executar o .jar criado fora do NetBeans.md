Tags: #Criando_e_configurando #Corrigindo_erro 

---
## ⚠ Qual o problema?

Pode ocorrer de quando você terminar de compilar a aplicação, ao visitar a pasta `dist` do projeto e executar o `.jar`, ele nao abrir.

Para corrigir isso, devemos executar o `.jar` com o <mark style="background: #727272;">CMD</mark>, passando um parâmetro de execução específico, forçando a aplicação a buscar a biblioteca do JavaFX no lugar especificado.

Primeiro, no <mark style="background: #727272;">CMD</mark> temos que dar um `cd` (Change directory) para a pasta `dist` do seu projeto (Onde se encontra o `.jar`).

```
cd "C:\Users\Arthur\Documents\Pastas\arthur_programacao\Java\Cursoemvideo\4.OlamundoJavaFX\dist"
```

No meu caso foi essa ai.

Logo após rodar o `cd`, devemos rodar o comando que executará o `.jar`:

```
java --module-path "C:\Users\Arthur\Downloads\javafx-sdk-21.0.2\lib" --add-modules javafx.controls,javafx.fxml -jar 4.OlamundoJavaFX.jar
```

Em `--module-path ""` devemos inserir dentro das aspas o diretório da nossa pasta `lib` do JavaFX.

Após executar o comando o app deve funcionar normalmente.

---
[[Java 6 - JavaFX]]