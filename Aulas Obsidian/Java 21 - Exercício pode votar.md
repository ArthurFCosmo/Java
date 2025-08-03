Tags: #Criando_e_configurando #Sintaxe 

---

## ## 📦 Iniciando o projeto

Criamos sem o Maven novamente, usando o Swing. Vamos em > projeto Java com o Ant, sem classe principal, depois criamos o JFrame dentro do pacote.

## 🔨 Colocando elementos no JFrame

Deixei ele assim:

![[img16_swing5voto.png]]

- 1 Spinner numérico
- 1 Botão
- 2 Labels variáveis

Lembre de configurar o spinner!

## ⚙Configurando o código

```java
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int anonasc = Integer.parseInt(jSpinner1.getValue().toString());
        int idade = 2025 - anonasc;
        String permissao = idade >= 18 ? "Pode votar" : idade >= 16 ? "Opcional": "Nao pode votar";        
        lblIdade.setText(Integer.toString(idade));
        lblPode.setText(permissao);
    }                                        
```

Vamos direto para o bloco de configurações do que acontece após o botão ser clicado.

Na linha 3, pegamos os dados do <mark style="background: #727272;">spinner</mark>, convertemos para <mark style="background: #727272;">int</mark> e colocamos na variável.

Na linha 4, calculamos a idade do user.

Na linha 5 usamos o operador ternário para definir uma string `permissao` baseado em uma condição.

Nas linhas 6 e 7, mostramos o resultado.



