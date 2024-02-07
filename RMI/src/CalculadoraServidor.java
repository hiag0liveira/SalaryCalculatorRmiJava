import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraServidor extends UnicastRemoteObject implements CalculaValorPago {
    protected CalculadoraServidor() throws RemoteException {
        super();
    }

    public ResultadoCalculo calculaValorPago(double salarioMensal, int horasTrabalhadas, int horasExtras, String mesVigente) throws RemoteException {
        // Lógica de cálculo conforme a CLT
        // Substitua com a lógica real de cálculo

        ResultadoCalculo resultado = new ResultadoCalculo();
        resultado.setValorTotal(salarioMensal);
        resultado.setDsr(salarioMensal * 0.1);
        resultado.setInss(salarioMensal * 0.08);

        return resultado;
    }

    public static void main(String[] args) {
        try {
            CalculadoraServidor servidor = new CalculadoraServidor();
            Naming.rebind("CalculaValorPago", servidor);

            System.out.println("Servidor RMI iniciado.");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
