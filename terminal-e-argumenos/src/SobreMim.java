import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("digite seu nome: ");
        String nome = scaner.next();

        System.out.println("Meu nome é: " + nome);
    }
}
