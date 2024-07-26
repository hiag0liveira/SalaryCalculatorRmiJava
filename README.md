**README - Remote Call Project in Java using RMI**

This project implements a remote calling system in Java using RMI (Remote Method Invocation). The system aims to calculate the amount to be paid to an hourly worker, considering the rules of the CLT (Consolidation of Labor Laws) in Brazil.

**Prerequisites:**
- JDK (Java Development Kit) installed.
- Java development environment (such as IntelliJ IDEA or Eclipse).

**Compilation Instructions:**
1. Open a terminal or command prompt.
2. Navigate to the directory where the Java files are located.
3. Compile the files using the command:
    ```bash
    javac CalculadoraServidor.java CalculadoraCliente.java CalculadoraValorPago.java ResultCalculo.java
    ```

**Execution Instructions:**
1. Start RMI registration. Run the command:
    ```bash
    rmiregistry
    ```
2. In a separate terminal, start the RMI server. Run the command:
    ```bash
    java CalculatorServer
    ```
3. In another terminal or command prompt, start the RMI client. Run the command:
    ```bash
    java CalculatorClient
    ```

**Network Settings:**
Make sure the network settings allow communication between the client and the server. Verify that firewalls are configured to allow communication on the standard RMI port (1099).

**Comments:**
- The `CalculaValorPago` class contains the logic for calculating the amount to be paid to the hourly worker. Customize according to CLT rules.
- The server interface and implementation uses Java's RMI API.

**References:**
- [The Java™ Tutorials - RMI](https://docs.oracle.com/javase/tutorial/rmi/index.html)
