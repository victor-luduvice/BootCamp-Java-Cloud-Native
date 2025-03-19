package DesafioProcessoSeletivo;

// Classe que representa um candidato no processo seletivo
public class Candidato {
    private int experiencia; // Nível de experiência do candidato (1 a 5)
    private String experienciaWeb; // Se o candidato tem experiência em desenvolvimento web (sim/não)
    private int projetosCompletados; // Quantidade de projetos concluídos
    private double salarioPretendido; // Salário que o candidato deseja receber

    // Construtor para criar um candidato com os atributos necessários
    public Candidato(int experiencia, String experienciaWeb, int projetosCompletados, double salarioPretendido) {
        this.experiencia = experiencia;
        this.experienciaWeb = experienciaWeb;
        this.projetosCompletados = projetosCompletados;
        this.salarioPretendido = salarioPretendido;
    }

    // Métodos "getter" para acessar os atributos do candidato
    public int getExperiencia() { return experiencia; }
    public String getExperienciaWeb() { return experienciaWeb; }
    public int getProjetosCompletados() { return projetosCompletados; }
    public double getSalarioPretendido() { return salarioPretendido; }

    // Método para exibir as informações do candidato de forma organizada
    @Override
    public String toString() {
        return "Experiência: " + experiencia + ", Web: " + experienciaWeb +
                ", Projetos: " + projetosCompletados + ", Salário Pretendido: R$" + salarioPretendido;
    }
}
