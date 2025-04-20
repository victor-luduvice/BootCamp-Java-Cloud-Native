package POO.PROJECT_03.Pagamentos;


public class PagamentoCartao implements FormaPagamento {
    @Override
    public boolean pagar(double valor) {
        System.out.println("Pagamento com Cartão aprovado: R$" + valor);
        return true;
    }

    @Override
    public String getTipo() {
        return "Cartão";
    }
}
