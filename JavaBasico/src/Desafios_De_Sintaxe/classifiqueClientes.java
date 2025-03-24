package Desafios_De_Sintaxe;

import java.util.Scanner;

public class classifiqueClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do saldo
        double saldo = scanner.nextDouble();

        // Classificação do cliente com base no saldo
        if (saldo < 0) {
            System.out.println("Negativado");
        } else if (saldo >= 0 && saldo <= 500) {
            System.out.println("Baixo");
        } else {
            System.out.println("Confortavel");
        }

        // Fechar o scanner
        scanner.close();
    }
}
