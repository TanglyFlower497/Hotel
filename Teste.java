package Atividade_hotel;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Endereco enderecoHotel = new Endereco("Rua das Palmeiras", 123, "São Paulo", "SP", "01234-567");
        Hotel hotel = new Hotel("Hotel Central", "12.345.678/0001-90", enderecoHotel);

        Quarto quarto1 = new Quarto(101, "Luxo", 200.0);
        Quarto quarto2 = new Quarto(102, "Simples", 120.0);
        hotel.setQuarto1(quarto1);
        hotel.setQuarto2(quarto2);
        // cadastro de hospede

        System.out.println("===== Cadastro de Hóspede =====");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        Hospede hospede = new Hospede(nome, cpf, telefone);

        // escolha do quarto

        System.out.println("\n===== Escolha o Quarto =====");
        System.out.println("1 - " + quarto1.getNome() + " - R$" + quarto1.getPreco());
        System.out.println("2 - " + quarto2.getNome() + " - R$$" + quarto2.getPreco());
        System.out.print("Opção: ");
        int opcaoQuarto = scanner.nextInt();
        scanner.nextLine();

        Quarto quartoSelecionado;

        if (opcaoQuarto == 1) {
            quartoSelecionado = quarto1;
        } else {
            quartoSelecionado = quarto2;
        }

        System.out.print("Data de entrada (ex: 10/05/2025): ");
        String dataEntrada = scanner.nextLine();
        System.out.print("Data de saída (ex: 12/05/2025): ");
        String dataSaida = scanner.nextLine();
        Reserva reserva = new Reserva(dataEntrada, dataSaida, hospede, quartoSelecionado);

        System.out.print("Forma de pagamento (Dinheiro, Cartão): ");
        String formaPagamento = scanner.nextLine();
        Pagamento pagamento = new Pagamento(quartoSelecionado.getPreco(), formaPagamento);
        pagamento.setPago(false);
        reserva.setPagamento(pagamento);

        // Achei melhor doq colocar um metodo(Exibir infromaçoes)
        System.out.println("\n===== RESUMO DA RESERVA =====");
        System.out.println("Hóspede: " + hospede.getNome());
        System.out.println("CPF: " + hospede.getCpf());
        System.out.println("Telefone: " + hospede.getTelefone());
        System.out.println("Quarto: " + quartoSelecionado.getNumero() + " - " + quartoSelecionado.getTipo());
        System.out.println("Entrada: " + reserva.getDataEntrada());
        System.out.println("Saída: " + reserva.getDataSaida());
        System.out.println("Valor: R$" + pagamento.getValor());
        System.out.println("Pagamento: " + pagamento.getFormaPagamento() + " - Pago: " + pagamento.isPago());
        scanner.close();
    }

}
