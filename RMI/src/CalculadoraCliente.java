import java.rmi.Naming;
import java.util.Scanner;

public class CalculadoraCliente {
    public static void main(String[] args) {
        try {
            // Obtendo referência remota do servidor
            CalculaValorPago calculadora = (CalculaValorPago) Naming.lookup("rmi://0.0.0.0/CalculaValorPago");

            // Usando Scanner para obter valores de entrada do usuário
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o salário mensal: ");
            double salarioMensal = scanner.nextDouble();

            System.out.print("Digite a quantidade de horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();

            System.out.print("Digite a quantidade de horas extras: ");
            int horasExtras = scanner.nextInt();

            System.out.print("Digite o mês vigente: ");
            String mesVigente = scanner.next();

            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();

            // Chamando o método remoto
            ResultadoCalculo resultado = calculadora.calculaValorPago(salarioMensal, horasTrabalhadas, horasExtras, mesVigente);

            // Exibindo resultados
            System.out.println("Valor Total: R$" + resultado.getValorTotal());
            System.out.println("Descanso Semanal Remunerado: R$" + resultado.getDsr());
            System.out.println("Contribuição ao INSS: R$" + resultado.getInss());

        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
