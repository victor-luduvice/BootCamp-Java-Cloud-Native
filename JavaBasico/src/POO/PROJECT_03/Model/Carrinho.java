package POO.PROJECT_03.Model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCompra> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        itens.add(new ItemCompra(produto, quantidade));
    }

    public void removerProduto(Produto produto) {
        itens.removeIf(item -> item.getProduto().equals(produto));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCompra item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public void limparCarrinho() {
        itens.clear();
    }
}
