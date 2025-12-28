import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String endereco;
        String horario;
        String formaPagamento;

        int opcao;
        double total = 0;

        System.out.println("=== BEM VINDO AO RESTAURANTE JAVA ===");

        // Dados do cliente
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite seu endereco: ");
        endereco = scanner.nextLine();

        System.out.print("Horario desejado para entrega: ");
        horario = scanner.nextLine();

        System.out.print("Forma de pagamento (Pix / Cartao / Dinheiro): ");
        formaPagamento = scanner.nextLine();

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ver cardapio");
            System.out.println("2 - Fazer pedido");
            System.out.println("3 - Finalizar pedido");

            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nCARDAPIO");
                    System.out.println("1 - Hamburguer - R$ 25.00");
                    System.out.println("2 - Pizza - R$ 40.00");
                    System.out.println("3 - Refrigerante - R$ 8.00");
                    break;

                case 2:
                    System.out.println("\nEscolha o item:");
                    System.out.println("1 - Hamburguer");
                    System.out.println("2 - Pizza");
                    System.out.println("3 - Refrigerante");

                    int item = scanner.nextInt();

                    switch (item) {
                        case 1:
                            total += 25;
                            System.out.println("Hamburguer adicionado!");
                            break;
                        case 2:
                            total += 40;
                            System.out.println("Pizza adicionada!");
                            break;
                        case 3:
                            total += 8;
                            System.out.println("Refrigerante adicionado!");
                            break;
                        default:
                            System.out.println("Item invalido.");
                    }
                    break;

                case 3:
                    System.out.println("\n===== RESUMO DO PEDIDO =====");
                    System.out.println("Cliente: " + nome);
                    System.out.println("Endereco: " + endereco);
                    System.out.println("Horario de entrega: " + horario);
                    System.out.println("Forma de pagamento: " + formaPagamento);

                    // ✅ FORMATA O VALOR CORRETAMENTE
                    System.out.printf("Total a pagar: R$ %.2f%n", total);

                    System.out.println("\nObrigado pela preferencia!");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
