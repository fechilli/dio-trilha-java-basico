package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private static void controlarEntrada() {
        System.out.println("CONTROLANDO ENTRADA DOS ITENS");
        
    }

    private static void controlarSaida() {
        System.out.println("CONTROLANDO SAIDA DOS ITENS");
        
    }

    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO GAS");
        
    }
}
