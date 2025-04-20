package POO.PROJECT_03.Pagamentos;

public interface FormaPagamento {
    boolean pagar(double valor);
    String getTipo();
}
