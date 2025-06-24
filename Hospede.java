package Atividade_hotel;
public class Hospede extends Pessoa {
    private String telefone;

    Hospede(String nome, String cpf, String telefone) {
        super(nome, cpf);
        this.telefone = telefone;
    }

    
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Telefone: " + telefone);
    }

    public String getTelefone() {
        return telefone;
    }
}


