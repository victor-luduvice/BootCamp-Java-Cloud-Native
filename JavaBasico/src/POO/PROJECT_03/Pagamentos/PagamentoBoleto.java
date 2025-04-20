package POO.PROJECT_03.Pagamentos;

public class PagamentoBoleto implements FormaPagamento {
    @Override
    public boolean pagar(double valor) {
        System.out.println("Boleto gerado no valor de R$" + valor);
        return true;
    }

    @Override
    public String getTipo() {
        return "Boleto";
    }
}
