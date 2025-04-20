package POO.PROJECT_02.Model;

// Classe que representa um prato do cardápio
// Implementa a interface Item
public class Prato implements Item {
    private String nome;
    private double preco;

    // Construtor para criar um prato com nome e preço
    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Redefine o método getNome() da interface Item
    @Override
    public String getNome() {
        return nome;
    }

    // Redefine o método getPreco() da interface Item
    @Override
    public double getPreco() {
        return preco;
    }
}
