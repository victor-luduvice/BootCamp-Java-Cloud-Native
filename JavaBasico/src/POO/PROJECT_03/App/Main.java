package POO.PROJECT_03.App;

import POO.PROJECT_03.Model.Cliente;
import POO.PROJECT_03.Model.Compra;
import POO.PROJECT_03.Model.ItemCompra;
import POO.PROJECT_03.Model.Produto;
import POO.PROJECT_03.Pagamentos.FormaPagamento;
import POO.PROJECT_03.Pagamentos.PagamentoBoleto;
import POO.PROJECT_03.Pagamentos.PagamentoCartao;
import POO.PROJECT_03.Pagamentos.PagamentoPix;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar produtos (simulados, ou pode carregar de arquivo)
        List<Produto> catalogo = new ArrayList<>();
        catalogo.add(new Produto("Notebook", "Notebook Dell", 3500.0, 10));
        catalogo.add(new Produto("Mouse", "Mouse sem fio", 80.0, 50));
        catalogo.add(new Produto("Teclado", "Teclado mecânico", 250.0, 30));

        // Criar cliente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();
        Cliente cliente = new Cliente(nome, email);

        int opcao;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Ver catálogo de produtos");
            System.out.println("2. Adicionar produto ao carrinho");
            System.out.println("3. Ver carrinho");
            System.out.println("4. Finalizar compra");
            System.out.println("5. Ver histórico de compras");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Catálogo ---");
                    for (int i = 0; i < catalogo.size(); i++) {
                        System.out.println(i + " - " + catalogo.get(i));
                    }
                    break;

                case 2:
                    System.out.print("Digite o número do produto: ");
                    int indexProduto = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    int qtd = scanner.nextInt();
                    Produto prod = catalogo.get(indexProduto);
                    if (qtd <= prod.getEstoque()) {
                        cliente.getCarrinho().adicionarProduto(prod, qtd);
                        prod.reduzirEstoque(qtd);
                        System.out.println("Produto adicionado ao carrinho!");
                    } else {
                        System.out.println("Quantidade indisponível em estoque.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Carrinho ---");
                    for (ItemCompra item : cliente.getCarrinho().getItens()) {
                        System.out.println(item.getProduto().getNome() + " x" + item.getQuantidade() + " - R$" + item.getSubtotal());
                    }
                    System.out.println("Total: R$" + cliente.getCarrinho().calcularTotal());
                    break;

                case 4:
                    System.out.println("Escolha a forma de pagamento:");
                    System.out.println("1. Pix | 2. Cartão | 3. Boleto");
                    int forma = scanner.nextInt();

                    FormaPagamento pagamento = null;
                    if (forma == 1) pagamento = new PagamentoPix();
                    else if (forma == 2) pagamento = new PagamentoCartao();
                    else if (forma == 3) pagamento = new PagamentoBoleto();

                    double totalCompra = cliente.getCarrinho().calcularTotal();
                    boolean sucesso = pagamento.pagar(totalCompra);

                    if (sucesso) {
                        Compra compra = new Compra((List<ItemCompra>) new ArrayList<>(cliente.getCarrinho().getItens()), totalCompra, (FormaPagamento) pagamento);
                        cliente.adicionarCompra(compra);
                        cliente.getCarrinho().limparCarrinho();
                        System.out.println("Compra finalizada!");
                        System.out.println(compra.resumoCompra());
                    } else {
                        System.out.println("Pagamento falhou.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Histórico de Compras ---");
                    for (Compra compra : cliente.getHistoricoCompras()) {
                        System.out.println(compra.resumoCompra());
                        System.out.println("-----------");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

