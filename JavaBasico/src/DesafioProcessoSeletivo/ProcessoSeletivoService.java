package DesafioProcessoSeletivo;

import java.util.ArrayList;
import java.util.Random;

// Classe responsável por gerenciar o processo seletivo
public class ProcessoSeletivoService {

    private final double SALARIO_BASE = 4000.00; // Definição do salário máximo oferecido pela empresa
    private final int MAX_CANDIDATOS = 5; // Número máximo de candidatos aprovados
    private Random random = new Random(); // Objeto para gerar valores aleatórios

    /**
     * Método que analisa um candidato com base em critérios definidos.
     * @param candidato Candidato a ser analisado.
     * @param candidatosSelecionados Lista onde os candidatos aprovados serão armazenados.
     * @return true se o candidato for aprovado, false caso contrário.
     */
    public boolean analisarCandidato(Candidato candidato, ArrayList<Candidato> candidatosSelecionados) {
        // Verifica se o candidato atende aos critérios mínimos de experiência e projetos
        if (candidato.getExperiencia() >= 4 && candidato.getExperienciaWeb().equals("sim") && candidato.getProjetosCompletados() >= 2) {
            System.out.println("Candidato aprovado! Agora, analisando salário...");

            // Verifica se o salário pretendido pelo candidato é menor ou igual ao salário base
            if (SALARIO_BASE >= candidato.getSalarioPretendido()) {
                // Verifica se ainda há vagas disponíveis na lista de aprovados
                if (candidatosSelecionados.size() < MAX_CANDIDATOS) {
                    candidatosSelecionados.add(candidato); // Adiciona o candidato à lista
                    System.out.println("Candidato adicionado à lista.");
                    return true;
                } else {
                    System.out.println("Limite de candidatos selecionados atingido.");
                    return false;
                }
            } else {
                System.out.println("O salário pretendido é maior que o salário base. Candidato não aprovado.");
                return false;
            }
        } else {
            System.out.println("Infelizmente, você não foi aprovado. Tente novamente.");
            return false;
        }
    }

    /**
     * Método que simula a tentativa do RH de entrar em contato com um candidato.
     * O RH terá até 3 tentativas para realizar a ligação.
     * @param candidato Candidato a ser contatado.
     */
    public void realizarLigacao(Candidato candidato) {
        int tentativas = 0;
        boolean contatoRealizado = false;

        // Loop que simula até 3 tentativas de contato
        while (tentativas < 3 && !contatoRealizado) {
            tentativas++;
            contatoRealizado = random.nextBoolean(); // Simula uma chance de 50% de sucesso na ligação

            if (contatoRealizado) {
                System.out.println("✅ Conseguimos entrar em contato com " + candidato + " após " + tentativas + " tentativa(s).");
            }
        }

        // Se após 3 tentativas não conseguir contato, exibe a mensagem de falha
        if (!contatoRealizado) {
            System.out.println("❌ Não conseguimos contato com " + candidato + ".");
        }
    }
}
