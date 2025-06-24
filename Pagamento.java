package Atividade_hotel;
public class Pagamento {
    private double valor;
    private String forma;
    private boolean pago;

    Pagamento(double valor, String forma) {
        this.valor = valor;
        this.forma = forma;
        this.pago = false;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public double getValor() {
        return valor;
    }

    public String getForma() {
        return forma;
    }

    public boolean isPago() {
        return pago;
    }
}

