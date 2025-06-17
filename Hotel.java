package Atividade_hotel;
public class Hotel extends Unidade {
    private String cnpj;
    private Endereco endereco;
    private Quarto quarto1;
    private Quarto quarto2;

    public Hotel(String nome, String cnpj, Endereco endereco) {
        super(nome);
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public void setQuarto1(Quarto q) { this.quarto1 = q; }
    public void setQuarto2(Quarto q) { this.quarto2 = q; }
    public Quarto getQuarto1() { return quarto1; }
    public Quarto getQuarto2() { return quarto2; }
}
