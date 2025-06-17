package Atividade_hotel;
public class Hospede extends Pessoa {
    private String telefone;

    public Hospede(String nome, String cpf, String telefone) {
        super(nome, cpf);
        this.telefone = telefone;
    }

    public String getTelefone() { return telefone; }
}

