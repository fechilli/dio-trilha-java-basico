import java.util.Scanner;

public class Desafio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        Float salario = scanner.nextFloat();
        System.out.println("Digite seu beneficio: ");
        Float beneficios = scanner.nextFloat();

        
        

        Float valorImposto = 0f;
        if(salario> 0 && salario <= 1100.00f){
            valorImposto = 0.05f* salario;
        }else if(salario >= 1100.01f && salario <=2500.00f) {
            valorImposto = 0.10f * salario;
        }else{
            valorImposto = 0.15f * salario;
        }

        Float salarioAtualizado = salario - valorImposto + beneficios;
        
        
        System.out.println("o salario é: "+salario + " e o beneficio e: "+ beneficios + " o imposto foi de: " + valorImposto + "O valor recebido é de R$ " +salarioAtualizado );

    }

}