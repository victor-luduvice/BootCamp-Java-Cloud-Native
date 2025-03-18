import java.util.Scanner;

public class SistemaDeSigla {
    public static void main(String[] args) {
        // Criar scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitar a sigla ao usuário
        System.out.print("Digite a sigla (P, M, G): ");
        String sigla = scanner.nextLine().toUpperCase();  // Convertendo para maiúsculo

        // Mapear a sigla para o tamanho correspondente
        String resultado;
        switch (sigla) {
            case "P":
                resultado = "Pequeno";
                break;
            case "M":
                resultado = "Médio";
                break;
            case "G":
                resultado = "Grande";
                break;
            default:
                resultado = "Sigla inválida!";
        }

        // Exibir o resultado
        System.out.println("O tamanho correspondente é: " + resultado);

        // Fechar o scanner
        scanner.close();
    }
}