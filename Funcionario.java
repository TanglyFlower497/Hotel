public class Funcionario implements IFuncionario {
    private String nome, cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    public double calcularSalario() {
        return salarioBase;
    }
}