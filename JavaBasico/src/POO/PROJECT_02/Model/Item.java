package POO.PROJECT_02.Model;

/* Todo item terá um nome e um preço, o tipo "interface" fará com que toda subclasse de "Item" teram os mesmos métodos */

public interface Item {
    String getNome();
    double getPreco();
}
