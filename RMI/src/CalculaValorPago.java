import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculaValorPago extends Remote {
    ResultadoCalculo calculaValorPago(double salarioMensal, int horasTrabalhadas, int horasExtras, String mesVigente) throws RemoteException;
}
