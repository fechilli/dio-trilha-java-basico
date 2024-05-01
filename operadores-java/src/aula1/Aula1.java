public class Aula1 {
    public static void main(String[] args) throws Exception {
    //    String nome = "Felipe"; // sempre entre aspas duplas
    //     int idade = 22; // somente numeros inteiros
    //    double peso = 68.5; // ponto separa o valor decimal e sempre ponto
    //    char sexo = 'M'; // aceira apenas 1 caractere e com aspas simples
    //    boolean doradorOrgao = false; // valor logico sim ou não 
    //    Date dataNaascimento = new Date(); // 



    // String nomeCompleto = "Linguagem"+" Java";
    // System.out.println(nomeCompleto);

    String concatenacao = "?";
   

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao); // quando a string vem por ultimo ele soma os anteriores
    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);// quando string vem no meio ele concatena tudo como string
    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);// quando string vem no meio ele concatena tudo como string
    concatenacao = "1" +(1+1+1);
    System.out.println(concatenacao);// como definimos a parte a soma ele concatena o resultado com a string
    }

    
}
