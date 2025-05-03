package Collections;
import java.util.ArrayList;

public class collection {
    // Uma coleção é uma estrutura de dados que serve para agrupar outros elementos em uma unica unidade.
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        for (String fruta : lista) {
            System.out.println(fruta);
        }
    }

    //add(elemento) – adiciona
    //
    //remove(elemento) – remove
    //
    //contains(elemento) – verifica se existe
    //
    //size() – quantidade de elementos
    //
    //clear() – remove todos
    //
    //isEmpty() – verifica se está vazia
    //
    //iterator() – para percorrer
}
