package POO.PROJECT_02.App;

import POO.PROJECT_02.Model.*; // Importa todas as classes do pacote model

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista que armazena o cardápio do restaurante (pratos e bebidas)
        List<Item> cardapio = new ArrayList<>();

        // Lista que armazena os pedidos feitos
        List<Pedido> pedidos = new ArrayList<>();

        while (true) {
            // Menu principal
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar prato");
            System.out.println("2. Cadastrar bebida");
            System.out.println("3. Criar pedido");
            System.out.println("4. Ver pedidos");
            System.out.println("5. Atualizar status");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            try {
                switch (opcao) {
                    case 1:
                        // Cadastra um prato no cardápio
                        System.out.print("Nome do prato: ");
                        String nomePrato = scanner.nextLine();
                        System.out.print("Preço: ");
                        double precoPrato = scanner.nextDouble();
                        cardapio.add(new Prato(nomePrato, precoPrato));
                        break;

                    case 2:
                        // Cadastra uma bebida no cardápio
                        System.out.print("Nome da bebida: ");
                        String nomeBebida = scanner.nextLine();
                        System.out.print("Preço: ");
                        double precoBebida = scanner.nextDouble();
                        cardapio.add(new Bebida(nomeBebida, precoBebida));
                        break;

                    case 3:
                        // Cria um novo pedido para um cliente
                        System.out.print("Nome do cliente: ");
                        String cliente = scanner.nextLine();
                        Pedido pedido = new Pedido(cliente);

                        // Adiciona itens ao pedido
                        while (true) {
                            System.out.println("Itens do cardápio:");
                            for (int i = 0; i < cardapio.size(); i++) {
                                System.out.println(i + " - " + cardapio.get(i).getNome() +
                                        " (R$ " + cardapio.get(i).getPreco() + ")");
                            }

                            System.out.print("Escolha o item (-1 para finalizar): ");
                            int itemId = scanner.nextInt();
                            if (itemId == -1) break;

                            System.out.print("Quantidade: ");
                            int qtd = scanner.nextInt();
                            pedido.adicionarItem(cardapio.get(itemId), qtd);
                        }

                        // Adiciona o pedido à lista de pedidos
                        pedidos.add(pedido);
                        break;

                    case 4:
                        // Exibe todos os pedidos feitos
                        for (int i = 0; i < pedidos.size(); i++) {
                            System.out.println("\nPedido #" + i);
                            pedidos.get(i).mostrarResumo();
                        }
                        break;

                    case 5:
                        // Atualiza o status de um pedido
                        System.out.print("Digite o número do pedido: ");
                        int idPedido = scanner.nextInt();

                        System.out.println("Novo status:");
                        System.out.println("1 - EM_PREPARO");
                        System.out.println("2 - FINALIZADO");
                        int status = scanner.nextInt();

                        // Atualiza com base na escolha
                        StatusPedido novo = status == 1 ? StatusPedido.EM_PREPARO : StatusPedido.FINALIZADO;
                        pedidos.get(idPedido).atualizarStatus(novo);
                        break;

                    case 6:
                        // Encerra o programa
                        System.out.println("Saindo...");
                        return;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine(); // Limpa o buffer
            }
        }
    }
}
