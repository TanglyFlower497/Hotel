package Atividade_hotel;
public class Quarto extends Unidade {
    private int numero;
    private String tipo;
    private double preco;

    public Quarto(int numero, String tipo, double preco) {
        super("Quarto " + numero);
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }

    public int getNumero() { return numero; }
    public String getTipo() { return tipo; }
    public double getPreco() { return preco; }
}
