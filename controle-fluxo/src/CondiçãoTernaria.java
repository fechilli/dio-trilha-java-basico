public class CondiçãoTernaria {
    public static void main(String[] args) {
        int nota = 7;

        String resultado = nota >7 ? "Aprovado" : "Reprovado"; // Exemplo com duas condições

        int idade = 15;

        String habilitacao = idade >= 18 ? "Pode dirigir" : idade > 18 && idade < 21 ? "não pode dirigir caminhão" : "não pode dirigir";

        System.out.println("Voce esta: " + resultado + " e sua nota foi: " + nota);
        System.out.println(habilitacao);

    }   
}
