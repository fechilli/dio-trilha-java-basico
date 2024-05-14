
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"ANDRE", "FELIPE", "ROSE", "MEIRE","AMANDA"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
        // analisarCandidato(1900.0);
        // analisarCandidato(2000.0);
        // analisarCandidato(2300.0);
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");
        } while (continuarTentando && tentativasRealizadas <3);

            if(atendeu) System.out.println("Conseguiu contato com" + candidato +  "  na " + tentativasRealizadas);
            else System.out.println("Não Conseguiu contato com" + candidato  );
    }
    //Método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1; // simula o valor de 1 a 3 onde se der 1 ele atendeu.
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"ANDRE", "FELIPE", "ROSE", "MEIRE","AMANDA", "CAROL", "NANDO", "CINTIA", "ROBERTO", "MARIA", "DIVINO", "CRISTINA", "VALDO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidado" + candidato + "Solicitou o salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("o candidato " + candidato + " foi selecionado pra vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++; // Incremento para passar para o próximo candidato
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void listarCandidatos(){
        String[] candidatos = {"ANDRE", "FELIPE", "ROSE", "MEIRE","AMANDA"};

        for(int c = 0; c < candidatos.length; c++){
            System.out.println("o candidato de numero " + c + "é o " +candidatos[c]);

            System.out.println("------------------------------------ ");


        }

        
        System.out.println("Usando o for each");
        for (String canditado : candidatos) {
            System.out.println("O candidato selecionado foi: " + canditado);

            System.out.println("------------------------------------ ");
        }

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar oferecendo contra proposta");

        }else{
            System.out.println("Aguardar outros candidatos");
        }
            
        
    }
}
