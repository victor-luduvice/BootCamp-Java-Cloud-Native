package TryCatch;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Código que pode gerar uma exceção
            int a = 10;
            int b = 0;
            int resultado = a / b; // Isso causará uma ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Captura e trata a exceção
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {
            // Bloco opcional que sempre será executado
            System.out.println("Finalizando execução.");
        }
    }
}
