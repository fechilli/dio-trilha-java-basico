import java.util.Random; 
public class ExemploDoWhile {
    public static void main(String[] args) {
        // codigo será executado pelo menos uma vez para tomar a decisao se será executada novamente;
        System.out.println("Discando.....");
        do{
           System.out.println("Telefone tocando"); 

        }while(tocando());

        System.out.println("Alo !!!");

    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1; // retorna falso se nao der 1 e continua tocando
        System.out.println("Atendeu? " + atendeu); 
        return ! atendeu; // quando der 1 retorna verdadeira e para de tocar
    }
}
