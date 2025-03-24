package Desafios_De_Sintaxe;

/*
Implemente um programa em Java que receba o saldo inicial de uma conta bancária e três transações
(positivas para depósitos e negativas para saques). O programa deve calcular e exibir o saldo final da conta.

             Entrada
- O programa deve receber:
Um número decimal representando o saldo inicial.
Três números decimais representando os valores das transações.
             Saída
- O saldo final da conta bancária após as três transações.
 */

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        // Criação do scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in);

        // Leitura do saldo inicial
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Leitura das três transações
        System.out.print("Digite o valor da primeira transação: ");
        double transacao1 = scanner.nextDouble();

        System.out.print("Digite o valor da segunda transação: ");
        double transacao2 = scanner.nextDouble();

        System.out.print("Digite o valor da terceira transação: ");
        double transacao3 = scanner.nextDouble();

        // Calculando o saldo final
        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        // Exibindo o saldo final
        System.out.printf("O saldo final da conta é: R$ %.2f\n", saldoFinal);

        // Fechando o scanner
        scanner.close();
    }
}

