package POO.PROJECT_03.Pagamentos;


public class PagamentoPix implements FormaPagamento {
    @Override
    public boolean pagar(double valor) {
        System.out.println("Pagamento via Pix realizado com sucesso: R$" + valor);
        return true;
    }

    @Override
    public String getTipo() {
        return "Pix";
    }
}
