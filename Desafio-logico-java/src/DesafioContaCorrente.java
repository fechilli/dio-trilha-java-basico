import java.util.Scanner;

public class DesafioContaCorrente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        System.out.println("Escolha uma opção do memu:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("0. Encerrar");

      
        while (true) { 
            System.out.println("Digite a opção desejada");
            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
        switch(opcao){
            
            case 1:
              System.out.println("Digite o valor do Deposito:");
              double deposito = scanner.nextDouble();
              saldo = saldo + deposito;
              System.out.println("Saldo atual: "+ saldo);
              break;
            case 2:
              System.out.println("Digite o valor para saque");
              double valorSaque = scanner.nextDouble();
              if(saldo < valorSaque){
                System.out.println("Saldo Insufucuente");
              }else{
                saldo = saldo - valorSaque;
                System.out.println("Saldo atual: "+ saldo);
              }
              break;
              
            case 3:
              System.out.println("Consultar Saldo");
              System.out.println("Saldo atual: "+ saldo);
              break;
            case 0:
              System.out.println("Encerrar");
              
              
              return;
        
                
        
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
        }
        
        }
    
    }
}
