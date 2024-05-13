import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
       // tratamentos de erros por exceção

       // try permite que testamos um bloco de codigo enquando esse é executado

       // Catch define o bloco de codifo que vai ser executado se houver uma falha no bloco try

       // finally define bloco de codigo a ser executado independente se houver erro
       try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();
            scanner.close();
        }catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numericos");  

        }
    }


}