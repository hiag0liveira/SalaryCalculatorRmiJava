**README - Projeto de Chamada Remota em Java usando RMI**

Este projeto implementa um sistema de chamada remota em Java utilizando RMI (Remote Method Invocation). O sistema visa calcular o valor a ser pago a um trabalhador horista, considerando as normas da CLT (Consolidação das Leis do Trabalho) do Brasil.

**Pré-requisitos:**
- JDK (Java Development Kit) instalado.
- Ambiente de desenvolvimento Java (como IntelliJ IDEA ou Eclipse).

**Instruções de Compilação:**
1. Abra um terminal ou prompt de comando.
2. Navegue até o diretório onde os arquivos Java estão localizados.
3. Compile os arquivos usando o comando:
    ```bash
    javac CalculadoraServidor.java CalculadoraCliente.java CalculaValorPago.java ResultadoCalculo.java
    ```

**Instruções de Execução:**
1. Inicie o registro RMI. Execute o comando:
    ```bash
    rmiregistry
    ```
2. Em um terminal separado, inicie o servidor RMI. Execute o comando:
    ```bash
    java CalculadoraServidor
    ```
3. Em outro terminal ou prompt de comando, inicie o cliente RMI. Execute o comando:
    ```bash
    java CalculadoraCliente
    ```

**Configurações de Rede:**
Certifique-se de que as configurações de rede permitam a comunicação entre o cliente e o servidor. Verifique se firewalls estão configurados para permitir a comunicação na porta padrão RMI (1099).

**Observações:**
- A classe `CalculaValorPago` contém a lógica de cálculo do valor a ser pago ao trabalhador horista. Personalize conforme as regras da CLT.
- A interface e implementação do servidor utilizam a API RMI do Java.

**Referências:**
- [The Java™ Tutorials - RMI](https://docs.oracle.com/javase/tutorial/rmi/index.html)
- Livros de referência sobre Java e RMI.
