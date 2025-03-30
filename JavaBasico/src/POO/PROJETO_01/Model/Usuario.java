package POO.PROJETO_01.Model;

public class Usuario {
    private String nome;
    private String matricula;

    public Usuario( String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }

    @Override
    public String toString() {
        return "Usuário [Nome=" + nome + ", Matrícula=" + matricula + "]";
    }
}
