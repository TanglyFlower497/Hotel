import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Endereco end = new Endereco("Av. Central", 100, "Cidade", "UF", "00000-000");
        Hotel hotel = new Hotel("Hotel Lux", "00.000.000/0001-00", end);

        hotel.adicionarQuarto(new Quarto(1, "Luxo", 300.0));
        hotel.adicionarQuarto(new Quarto(2, "Simples", 150.0));

        System.out.println("===== Cadastro de Hóspede =====");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Telefone: ");
        String tel = sc.nextLine();
        Hospede hospede = new Hospede(nome, cpf, tel);

        System.out.println("===== Quartos Disponíveis =====");
        for (Quarto q : hotel.getQuartos()) {
            if (q != null)
                System.out.println(q.getNumero() + " - " + q.getTipo() + " - R$" + q.getPreco());
        }

        System.out.print("Escolha o número do quarto: ");
        int num = sc.nextInt();
        sc.nextLine();

        Quarto escolhido = hotel.getQuartos()[num - 1];

        System.out.print("Data entrada: ");
        String entrada = sc.nextLine();
        System.out.print("Data saída: ");
        String saida = sc.nextLine();
        Reserva reserva = new Reserva(entrada, saida, hospede, escolhido);

        System.out.print("Forma de pagamento: ");
        String forma = sc.nextLine();
        Pagamento pag = new Pagamento(escolhido.getPreco(), forma);
        pag.setPago(true);
        reserva.setPagamento(pag);

        System.out.println("\n===== RESUMO DA RESERVA =====");
        System.out.println("Hóspede: " + hospede.getNome());
        System.out.println("Quarto: " + escolhido.getNumero() + " - " + escolhido.getTipo());
        System.out.println("Entrada: " + entrada);
        System.out.println("Saída: " + saida);
        System.out.println("Valor: R$" + pag.getValor());
        System.out.println("Pagamento: " + pag.getFormaPagamento() + " - Pago: " + pag.isPago());
    }
}