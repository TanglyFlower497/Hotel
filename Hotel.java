public class Hotel {
    private String nome, cnpj;
    private Endereco endereco;
    private Quarto[] quartos = new Quarto[10];
    private int indice = 0;

    public Hotel(String nome, String cnpj, Endereco endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public void adicionarQuarto(Quarto q) {
        if (indice < quartos.length) {
            quartos[indice++] = q;
        }
    }

    public Quarto[] getQuartos() {
        return quartos;
    }

    public String getNome() { return nome; }
    public String getCnpj() { return cnpj; }
}