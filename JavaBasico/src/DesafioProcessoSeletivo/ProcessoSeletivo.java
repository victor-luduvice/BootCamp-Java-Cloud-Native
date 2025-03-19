package DesafioProcessoSeletivo;

import java.util.ArrayList;
import java.util.Scanner;

// Classe principal que executa o processo seletivo
public class ProcessoSeletivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Candidato> candidatosSelecionados = new ArrayList<>();
        ProcessoSeletivoService processoSeletivoService = new ProcessoSeletivoService();

        int tentativas = 0;
        final int MAX_TENTATIVAS = 10; // Número máximo de entrevistas permitidas

        System.out.println("📢 Bem-vindo ao processo seletivo!");

        // Loop para coletar informações de múltiplos candidatos
        while (tentativas < MAX_TENTATIVAS && candidatosSelecionados.size() < 5) {
            try {
                // Pergunta 1: Nível de experiência com Java
                System.out.print("Qual o seu nível de experiência com Java? (1 a 5): ");
                int experiencia = Integer.parseInt(scanner.nextLine());

                if (experiencia < 1 || experiencia > 5) {
                    throw new IllegalArgumentException("❌ Nível de experiência inválido! Deve ser entre 1 e 5.");
                }

                // Pergunta 2: Experiência em desenvolvimento web
                System.out.print("Você tem experiência em desenvolvimento web? (sim/nao): ");
                String experienciaWeb = scanner.nextLine().toLowerCase();

                if (!experienciaWeb.equals("sim") && !experienciaWeb.equals("nao")) {
                    throw new IllegalArgumentException("❌ Resposta inválida! Digite 'sim' ou 'nao'.");
                }

                // Pergunta 3: Projetos concluídos
                System.out.print("Quantos projetos você completou? ");
                int projetosCompletados = Integer.parseInt(scanner.nextLine());

                if (projetosCompletados < 0) {
                    throw new IllegalArgumentException("❌ Número de projetos não pode ser negativo.");
                }

                // Pergunta 4: Salário pretendido
                System.out.print("Qual o seu salário pretendido? ");
                double salarioPretendido = Double.parseDouble(scanner.nextLine());

                // Criando um novo candidato com os dados informados
                Candidato candidato = new Candidato(experiencia, experienciaWeb, projetosCompletados, salarioPretendido);

                // Chamando método para analisar o candidato
                if (processoSeletivoService.analisarCandidato(candidato, candidatosSelecionados)) {
                    System.out.println("✅ Candidato aprovado e adicionado à lista.");
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida. Digite um número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            tentativas++;
        }

        // Exibir candidatos aprovados e tentar entrar em contato
        if (!candidatosSelecionados.isEmpty()) {
            System.out.println("\n📞 **Lista de Candidatos Selecionados - RH, entre em contato!**");
            for (Candidato candidato : candidatosSelecionados) {
                System.out.println(candidato);
                processoSeletivoService.realizarLigacao(candidato);
            }
        } else {
            System.out.println("❌ Nenhum candidato foi selecionado.");
        }

        scanner.close();
    }
}

