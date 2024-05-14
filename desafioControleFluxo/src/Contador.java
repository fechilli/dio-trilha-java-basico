import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (IllegalArgumentException e) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior ou igual ao primeiro
            System.out.println("O resultado não pode ser negativo, o parâmetro 2 nunca pode ser menor que o parâmetro 1!");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws  IllegalArgumentException{
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois <= parametroUm) {
            throw new IllegalArgumentException("err");
        } else {
            int contagem = parametroDois - parametroUm;
            // Realizar o for para imprimir os números com base na variável contagem
            System.out.println("O resultado foi :" + contagem);
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Contagem: " +i);

            }
        }
    }
}
