package Atividade_hotel;
public class Pagamento {
    private double valor;
    private String formaPgto;
    private boolean pago;

    public Pagamento(double valor, String formaPgto) {
        this.valor = valor;
        this.formaPgto = formaPgto;
        this.pago = false;
    }

    public double getValor() { return valor; }
    public String getFormaPagamento() { return formaPgto; }
    public boolean isPago() { return pago; }
    public void setPago(boolean pago) { this.pago = pago; }
}
