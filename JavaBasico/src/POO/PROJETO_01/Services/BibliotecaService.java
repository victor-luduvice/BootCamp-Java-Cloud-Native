package POO.PROJETO_01.Services;


import POO.PROJETO_01.Model.Usuario;
import POO.PROJETO_01.Model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public BibliotecaService() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void registrarEmprestimo(@org.jetbrains.annotations.NotNull Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, dataDevolucao);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: " + emprestimo);
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void adicionarUsuario(Usuario leitor1) {
    }
}

