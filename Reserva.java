package Atividade_hotel;
public class Reserva {
    private String dataEntrada;
    private String dataSaida;
    private Hospede hospede;
    private Quarto quarto;
    private Pagamento pagamento;

    public Reserva(String dataEntrada, String dataSaida, Hospede hospede, Quarto quarto) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.hospede = hospede;
        this.quarto = quarto;
    }

    public String getDataEntrada() { return dataEntrada; }
    public String getDataSaida() { return dataSaida; }
    public Hospede getHospede() { return hospede; }
    public Quarto getQuarto() { return quarto; }
    public Pagamento getPagamento() { return pagamento; }
    public void setPagamento(Pagamento pagamento) { this.pagamento = pagamento; }
}

