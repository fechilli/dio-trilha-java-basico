import java.util.Scanner;

public class DesafioValidarConta{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número da conta: ");
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);

            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            // Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // Lançar uma IllegalArgumentException com a mensagem apropriada
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
        }
    }
}
