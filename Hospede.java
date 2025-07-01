public class Hospede implements IPessoa {
    private String nome, cpf, telefone;

    public Hospede(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getTelefone() { return telefone; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
}