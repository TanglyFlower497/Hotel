public class Endereco {
    private String rua;
    private int numero;
    private String cidade, estado, cep;

    public Endereco(String rua, int numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getEnderecoCompleto() {
        return rua + ", " + numero + " - " + cidade + "/" + estado + " - CEP: " + cep;
    }
}