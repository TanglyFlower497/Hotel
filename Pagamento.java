public class Pagamento {
    private double valor;
    private String formaPagamento;
    private boolean pago;

    public Pagamento(double valor, String formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.pago = false;
    }

    public double getValor() { return valor; }
    public String getFormaPagamento() { return formaPagamento; }
    public boolean isPago() { return pago; }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}