package Atividade_hotel;

import java.util.Scanner;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Endereco end = new Endereco("Rua das Palmeiras", 123, "São Paulo", "SP", "01234-567");
        Hotel hotel = new Hotel("Hotel Central", "12.345.678/0001-90", end);

        Quarto q1 = new Quarto(101, "Luxo", 200.0);
        Quarto q2 = new Quarto(102, "Simples", 120.0);
        hotel.setQuartos(q1, q2);

        System.out.println("===== Cadastro de Hóspede =====");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Telefone: ");
        String tel = sc.nextLine();
        Hospede hospede = new Hospede(nome, cpf, tel);

        System.out.println("\n===== Escolha o Quarto =====");
        System.out.println("1 - Quarto " + q1.getNumero() + " - R$" + q1.getPreco());
        System.out.println("2 - Quarto " + q2.getNumero() + " - R$" + q2.getPreco());
        System.out.print("Opção: ");
        int op = sc.nextInt();
        sc.nextLine();

        Quarto quartoSelecionado;
        if (op == 1) {
            quartoSelecionado = q1;
        } else {
            quartoSelecionado = q2;
        }

        System.out.print("Data de entrada: ");
        String entrada = sc.nextLine();
        System.out.print("Data de saída: ");
        String saida = sc.nextLine();

        Reserva reserva = new Reserva(entrada, saida, hospede, quartoSelecionado);

        System.out.print("Forma de pagamento: ");
        String forma = sc.nextLine();
        Pagamento pagamento = new Pagamento(quartoSelecionado.getPreco(), forma);
        pagamento.setPago(true);

        System.out.println("\n===== RESUMO DA RESERVA =====");
        Pessoa p = hospede; //polimirfismo
        p.exibirDados();
        System.out.println("Quarto: " + quartoSelecionado.getNumero() + " - " + quartoSelecionado.getTipo());
        System.out.println("Entrada: " + reserva.getDataEntrada());
        System.out.println("Saída: " + reserva.getDataSaida());
        System.out.println("Valor: R$" + pagamento.getValor());
        System.out.println("Pagamento: " + pagamento.getForma() + " - Pago: " + pagamento.isPago());

        System.out.println("\n===== FUNCIONÁRIOS DO HOTEL =====");
        Funcionario f1 = new Funcionario("Carlos Silva", "123.456.789-00", "Recepcionista");
        Gerente g1 = new Gerente("Ana Souza", "987.654.321-00", "Total");

        f1.exibirDados();
        System.out.println();
        g1.exibirDados();
    }
}

