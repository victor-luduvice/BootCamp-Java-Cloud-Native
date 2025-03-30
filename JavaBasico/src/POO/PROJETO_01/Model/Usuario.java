package POO.PROJETO_01.Model;

public class Usuario {
    private String nome;
    private String matricula;

    public Usuario( String nome){
        this.nome = nome;
        this.matricula = matricula;
    }

    public Usuario(String joao, String number) {
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }

    @Override
    public String toString() {
        return "Usuário [Nome=" + nome + ", Matrícula=" + matricula + "]";
    }
}
