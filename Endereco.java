package Atividade_hotel;
public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, int numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() { return rua; }
    public int getNumero() { return numero; }
    public String getCidade() { return cidade; }
    public String getEstado() { return estado; }
    public String getCep() { return cep; }
}

//hola
