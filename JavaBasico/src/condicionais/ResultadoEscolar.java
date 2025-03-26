package condicionais;

// Definindo a classe pública chamada "ResultadoEscolar"
public class ResultadoEscolar {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Declarando e inicializando a variável "nota" com o valor 7
        int nota = 7;

        // Estrutura condicional para verificar se a nota é maior ou igual a 7
        if (nota >= 7)
            // Se a condição for verdadeira, imprime "Aprovado"
            System.out.println("Aprovado");

            // Caso a primeira condição não seja atendida, verifica se a nota está entre 5 e 6
        else if (nota >= 5 && nota < 7)
            // Se a condição for verdadeira, imprime "Prova de Recuperação"
            System.out.println("Prova de Recuperação");

            // Caso nenhuma das condições anteriores seja atendida
        else
            // Imprime "Reprovado" como resultado final
            System.out.println("Reprovado");
    }
}
