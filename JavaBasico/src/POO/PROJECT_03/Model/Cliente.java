package POO.PROJECT_03.Model;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String email;
    private Carrinho carrinho;
    private List<Compra> historicoCompras;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.carrinho = new Carrinho();
        this.historicoCompras = new ArrayList<>();
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void adicionarCompra(Compra compra) {
        historicoCompras.add(compra);
    }

    public List<Compra> getHistoricoCompras() {
        return historicoCompras;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}

