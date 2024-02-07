import java.io.Serializable;

public class ResultadoCalculo implements Serializable {
    private double valorTotal;
    private double dsr;
    private double inss;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getDsr() {
        return dsr;
    }

    public void setDsr(double dsr) {
        this.dsr = dsr;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }
}
