package Atividade_hotel;
public class Hotel {
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private Quarto quarto1;
    private Quarto quarto2;

Hotel(String nome, String cnpj, Endereco endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public void setQuartos(Quarto q1, Quarto q2) {
        this.quarto1 = q1;
        this.quarto2 = q2;
    }

    public Quarto getQuarto1() {
        return quarto1;
    }

    public Quarto getQuarto2() {
        return quarto2;
    }
}
