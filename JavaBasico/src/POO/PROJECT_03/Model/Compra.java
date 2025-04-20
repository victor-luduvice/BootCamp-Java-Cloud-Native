package POO.PROJECT_03.Model;
import java.time.LocalDate;
import java.util.List;
import POO.PROJECT_03.Pagamentos.FormaPagamento;

public class Compra {
    private List<ItemCompra> itens;
    private double total;
    private LocalDate data;
    private FormaPagamento formaPagamento;

    public Compra(List<ItemCompra> itens, double total, FormaPagamento formaPagamento) {
        this.itens = itens;
        this.total = total;
        this.formaPagamento = formaPagamento;
        this.data = LocalDate.now();
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getData() {
        return data;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public String resumoCompra() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data: ").append(data).append("\n");
        for (ItemCompra item : itens) {
            sb.append(item.getProduto().getNome())
                    .append(" x").append(item.getQuantidade())
                    .append(" - R$").append(item.getSubtotal()).append("\n");
        }
        sb.append("Total: R$").append(total).append("\n");
        sb.append("Pagamento: ").append(formaPagamento.getTipo()).append("\n");
        return sb.toString();
    }
}
