package POO.PROJETO_01.Model;

public class Administrador extends Usuario {
    public Administrador(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String toString() {
        return "Administrador [Nome=" + getNome() + ", Matrícula=" + getMatricula() + "]";
    }
}