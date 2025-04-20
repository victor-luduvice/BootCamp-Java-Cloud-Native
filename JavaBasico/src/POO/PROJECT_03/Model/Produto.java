package POO.PROJECT_03.Model;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;

    public Produto(String nome, String descricao, double preco, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void reduzirEstoque(int quantidade) {
        this.estoque -= quantidade;
    }

    public void aumentarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco + " | Estoque: " + estoque;
    }
}