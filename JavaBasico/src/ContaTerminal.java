import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitando e capturando os dados do usuário
            System.out.println("Por favor, digite o seu nome:");
            String nomeCliente = scanner.nextLine().trim();
            if (nomeCliente.isEmpty()) {
                System.out.println("Nome não pode estar vazio.");
                return;
            }

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine().trim();
            if (agencia.isEmpty()) {
                System.out.println("Agência não pode estar vazia.");
                return;
            }

            System.out.println("Por favor, digite o número da Conta:");
            int numeroConta;
            if (scanner.hasNextInt()) {
                numeroConta = scanner.nextInt();
                if (numeroConta <= 0) {
                    System.out.println("Número da conta deve ser maior que zero.");
                    return;
                }
            } else {
                System.out.println("Entrada inválida para número da conta.");
                return;
            }

            System.out.println("Por favor, digite o saldo inicial:");
            double saldo;
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
                if (saldo < 0) {
                    System.out.println("Saldo não pode ser negativo.");
                    return;
                }
            } else {
                System.out.println("Entrada inválida para saldo.");
                return;
            }

            // Exibindo a mensagem final com os dados inseridos
            System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                    "sua agência é " + agencia + ", conta " + numeroConta +
                    " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir os valores corretamente.");
        } finally {
            // Fechando o scanner
            scanner.close();
        }
    }
}

/**
 * Casos de Uso:
 * 1. Criar uma conta bancária com dados válidos.
 *    Entrada: Nome: João, Agência: 1234, Conta: 56789, Saldo: 1500.75
 *    Saída: "Olá João, obrigado por criar uma conta em nosso banco, sua agência é 1234, conta 56789 e seu saldo 1500.75 já está disponível para saque."
 *
 * 2. Criar uma conta com saldo zero.
 *    Entrada: Nome: Maria, Agência: 4321, Conta: 98765, Saldo: 0.0
 *    Saída: "Olá Maria, obrigado por criar uma conta em nosso banco, sua agência é 4321, conta 98765 e seu saldo 0.0 já está disponível para saque."
 *
 * 3. Criar uma conta com valores grandes.
 *    Entrada: Nome: Carlos, Agência: 1111, Conta: 22222, Saldo: 1000000.99
 *    Saída: "Olá Carlos, obrigado por criar uma conta em nosso banco, sua agência é 1111, conta 22222 e seu saldo 1000000.99 já está disponível para saque."
 *
 * 4. Tentativa de inserir um número de conta inválido.
 *    Entrada: Nome: Ana, Agência: 5678, Conta: -123, Saldo: 500.00
 *    Saída: "Número da conta deve ser maior que zero."
 *
 * 5. Tentativa de inserir um saldo negativo.
 *    Entrada: Nome: Pedro, Agência: 8765, Conta: 34567, Saldo: -200.00
 *    Saída: "Saldo não pode ser negativo."
 */
