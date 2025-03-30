package POO.PROJETO_01.Interface;

import POO.PROJETO_01.Model.*;
import POO.PROJETO_01.Services.*;
import java.time.LocalDate;

public class BibliotecaApp {
    public static void main(String[] args) {
        BibliotecaService biblioteca = new BibliotecaService();

        // Criando alguns usuários e livros
        Usuario leitor1 = new Usuario("joao", "00090");
        Usuario admin1 = new Administrador("Lucas Silva", "ADM001");

        Livro livro1 = new Livro("Java para Iniciantes", "Paulo Silva", "12345", 2023);
        Livro livro2 = new Livro("Estrutura de Dados", "Ana Lima", "67890", 2022);

        biblioteca.adicionarUsuario(leitor1);
        biblioteca.adicionarUsuario(admin1);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Registrando um empréstimo
        biblioteca.registrarEmprestimo(livro1, leitor1, LocalDate.now(), LocalDate.now().plusDays(14));
    }
}