import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
       //Todo: conhecer e importar as classes
        System.out.println("Seja bem vindo ao sistema de criação de conta Banco Lu");
       //exibir as mensagens para o nosso usuario
        System.out.println("Digite o número da agencia:... ");
        int numAgencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite sua agencia com digito:... ");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome:... ");
        String nome = scanner.nextLine();


        System.out.println("Digite seu sobrenome:... ");
        String sobrenome = scanner.nextLine();


        System.out.println("Digite seu saldo... ");
        double saldo = scanner.nextDouble();

        System.out.println("------------------------------------------------------ ");
        System.out.println(" Dados da conta ");
        System.out.println("------------------------------------------------------ ");

        System.out.println("Numero da Agencia:     " + numAgencia);
        System.out.println("Agencia:     " + agencia);
        System.out.println("Nome:     " +nome);
        System.out.println("Sobrenome:    " + sobrenome);
        System.out.println("Saldo:     " + saldo);
        System.out.println("------------------------------------------------------ ");

        System.out.println("Conta criada com sucesso! ");



       // obter pela scanner os valores digitados no terminal

       // exibir a mensagem conta criada




    }
}
