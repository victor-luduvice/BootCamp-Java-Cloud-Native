package POO.PROJECT_02.Model;

import java.util.ArrayList;
import java.util.List;

// Classe que representa um pedido feito por um cliente
public class Pedido {
    private String cliente;
    private List<ItemPedido> itens; // Lista com os itens do pedido
    private StatusPedido status;

    // Construtor inicia com status PENDENTE
    public Pedido(String cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = StatusPedido.PENDENTE;
    }

    // Adiciona um item ao pedido
    public void adicionarItem(Item item, int quantidade) {
        itens.add(new ItemPedido(item, quantidade));
    }

    // Atualiza o status do pedido
    public void atualizarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    // Calcula o valor total do pedido
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getTotal();
        }
        return total;
    }

    // Exibe o resumo do pedido no console
    public void mostrarResumo() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Status: " + status);
        for (ItemPedido item : itens) {
            System.out.println("- " + item.getDescricao());
        }
        System.out.println("Total: R$ " + calcularTotal());
    }

    // Getters
    public StatusPedido getStatus() {
        return status;
    }

    public String getCliente() {
        return cliente;
    }

    // Classe que representa um item dentro de um pedido
    public static class ItemPedido {
        private Item item;         // Pode ser Prato ou Bebida
        private int quantidade;

        // Construtor
        public ItemPedido(Item item, int quantidade) {
            this.item = item;
            this.quantidade = quantidade;
        }

        // Calcula o valor total do item (preço * quantidade)
        public double getTotal() {
            return item.getPreco() * quantidade;
        }

        // Retorna uma descrição amigável do item
        public String getDescricao() {
            return quantidade + "x " + item.getNome() + " (R$ " + item.getPreco() + ")";
        }
    }
}
